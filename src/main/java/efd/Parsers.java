package efd;

import efd.anotacoes.*;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Parsers {

    public static String converteBlocoEmString(Object obj, boolean processaFilhos) {

        Grupo grupo = null;

        List arr = new ArrayList();
        Class clazz = obj.getClass();

        String formatoData, formatoHora;
        int decimais, zerosEsquerda;
        Object anotacao;

        StringBuilder sb = new StringBuilder();
        List<Object> nosFilhos = new ArrayList<Object>();

        for(Field m : clazz.getDeclaredFields()){

            m.setAccessible(true);

            boolean isGrupo = false;
            try {
                if (m.getName().equals("grupo")) {
                    if (m.get(obj) != null) {
                        grupo = (Grupo) m.get(obj);
                    }
                }
            } catch (Exception e){ }

            if(grupo != null){
                if(grupo.equals(Grupo.G1)){
                    isGrupo = m.isAnnotationPresent(G1.class);
                } else if(grupo.equals(Grupo.G2)){
                    isGrupo = m.isAnnotationPresent(G2.class);
                } else if(grupo.equals(Grupo.G3)){
                    isGrupo = m.isAnnotationPresent(G3.class);
                } else if(grupo.equals(Grupo.G4)){
                    isGrupo = m.isAnnotationPresent(G4.class);
                } else if(grupo.equals(Grupo.G5)){
                    isGrupo = m.isAnnotationPresent(G5.class);
                } else if(grupo.equals(Grupo.G6)){
                    isGrupo = m.isAnnotationPresent(G6.class);
                } else if(grupo.equals(Grupo.G7)){
                    isGrupo = m.isAnnotationPresent(G7.class);
                } else if(grupo.equals(Grupo.G8)){
                    isGrupo = m.isAnnotationPresent(G8.class);
                } else if(grupo.equals(Grupo.G9)){
                    isGrupo = m.isAnnotationPresent(G9.class);
                }
            }

            if(grupo == null){
                isGrupo = true;
            }

            if (m.isAnnotationPresent(Inclui.class) && isGrupo) {

                anotacao = m.getAnnotation(Inclui.class);
                formatoData = ((Inclui) anotacao).formatoData();
                formatoHora = ((Inclui) anotacao).formatoHora();
                decimais = ((Inclui) anotacao).casasDecimais();
                zerosEsquerda = ((Inclui) anotacao).zerosEsquerda();

                try {

                    Object o = null;
                    if(m.get(obj) != null){

                        if (m.getType().equals(BigDecimal.class)) {

                            o = (String) formataNumero((BigDecimal) m.get(obj), decimais);

                        } else if (m.getType().equals(String.class)) {

                            o = (String) m.get(obj);

                        } else if (m.getType().equals(Integer.class)) {

                            o = (Integer) m.get(obj);

                            if (zerosEsquerda > 0) {
                                o = String.format("%0" + zerosEsquerda+ "d", o);
                            }

                        } else if (m.getType().equals(LocalDate.class)) {

                            o = (String) formataData((LocalDate) m.get(obj), formatoData);

                        } else if (m.getType().equals(LocalTime.class)) {

                            o = (String) formataHora((LocalTime) m.get(obj), formatoHora);

                        } else if (m.getType().equals(Long.class)) {

                            o = (Long) m.get(obj);

                            if (zerosEsquerda > 0) {
                                o = String.format("%0" + zerosEsquerda+ "d", o);
                            }

                        }

                    } else {
                      o = StringUtils.EMPTY;
                    }

                    arr.add(o.toString());

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            } else if (m.isAnnotationPresent(Filho.class) && processaFilhos) {

                try {
                    if (m.get(obj) != null) {
                        nosFilhos.add(m.get(obj));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }

        }

        // remove da lista os valores null
        arr.removeAll(Collections.singleton(null));

        if(arr.size() > 0) {
            sb.append("|" + String.join("|", arr) + "|" + System.getProperty("line.separator"));
        }

        for(Object j : nosFilhos){

            if (j.getClass().equals(ArrayList.class)) {

                for(Object o : (ArrayList) j){

                    sb.append(new Parsers().converteBlocoEmString(o, processaFilhos));

                }

            } else {

                sb.append(new Parsers().converteBlocoEmString(j, processaFilhos));

            }

        }

        return sb.toString();

        /*
        String diretorioArquivo = System.getProperty("java.io.tmpdir") + "SPED-" + System.currentTimeMillis() + ".txt";
        Path path = Paths.get(diretorioArquivo);

        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(diretorioArquivo, true)))){

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
        */

    }

    protected static String formataData(LocalDate data, String f) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(f);
        return formato.format(data);
    }

    protected static String formataHora(LocalTime data, String f) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern(f);
        return formato.format(data);
    }

    protected static String formataNumero(BigDecimal numero, Integer decimais){
        return String.format(new Locale("pt", "BR"), "%."+decimais+"f", numero);
    }

}
