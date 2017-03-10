package control;

import java.text.SimpleDateFormat;
import java.util.Date;

import static ui.UiCadFuncTeste.cb_civil;

/**
 *
 * @author Maria Pysklevicz
 */
public class Funcoes {

    /**
     *
     * @return
     */
    //
    public static String[] buscarAnos(){
        String dados[]; 
        Date hoje = new Date();//data atual do sistema
        String formato = "yyyy";//formatoque eu quero pegar da data 
        SimpleDateFormat formatter = new SimpleDateFormat(formato);
        //instancio esse objeto passando o formato que eu quero 
        int anoatual=Integer.parseInt(formatter.format(hoje));//esse metodo vai retornar o ano 
        dados= new String[anoatual-1898]; 
        dados[0]= "Anos";//esse campo é para no primeiro aparecer a palavra anos
            for (int i=1;anoatual>=1900;i++){//este for vai parar quando o ano atual for menor a 1900
            dados[i]=String.valueOf(anoatual);//aqui eu vou passando para o vetor os anos
            anoatual--;//aqui eu vou decrementando os anos
            } 
        return dados; 
    }
    // nacionalidade
    public static String[] paises(){
        String paises[] = new String[]{"Selecione o país","Afghanistan","Albania","Algeria","Andorra","Angola","Antigua and Barbuda","Argentina","Armenia","Australia","Austria","Azerbaijan",
            "Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bhutan","Bolivia",
            "Bosnia and Herzegovina","Botswana","Brazil","Brunei","Bulgaria","Burkina Faso","Burundi","Cabo Verde","Cambodia","Cameroon",
            "Canada","Central African Republic (CAR)","Chad","Chile","China","Colombia","Comoros","Democratic Republic of the Congo","Republic of the Congo","Costa Rica",
            "Cote d'Ivoire","Croatia","Cuba","Cyprus","Czech Republic","Denmark","Djibouti","Dominica","Dominican Republic","Ecuador",
            "Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Ethiopia","Fiji","Finland","France","Gabon",
            "Gambia","Georgia","Germany","Ghana","Greece","Grenada","Guatemala","Guinea","Guinea-Bissau","Guyana",
            "Haiti","Honduras","Hungary","Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel",
            "Italy","Jamaica","Japan","Jordan","Kazakhstan","Kenya","Kiribati","Kosovo","Kuwait","Kyrgyzstan",
            "Laos","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg","Macedonia",
            "Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Mauritania","Mauritius","Mexico",
            "Micronesia","Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique","Myanmar (Burma)","Namibia","Nauru",
            "Nepal","Netherlands","New Zealand","Nicaragua","Niger","Nigeria","North Korea","Norway","Oman","Pakistan",
            "Palau","Palestine","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Poland","Portugal","Qatar",
            "Romania","Russia","Rwanda","Saint Kitts and Nevis","Saint Lucia","Saint Vincent and the Grenadines","Samoa","San Marino","Sao Tome and Principe","Saudi Arabia",
            "Senegal","Serbia","Seychelles","Sierra Leone","Singapore","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa",
            "South Korea","South Sudan","Spain","Sri Lanka","Sudan","Suriname","Swaziland","Sweden","Switzerland","Syria",
            "Taiwan","Tajikistan","Tanzania","Thailand","Timor-Leste","Togo","Tonga","Trinidad and Tobago","Tunisia","Turkey",
            "Turkmenistan","Tuvalu","Uganda","Ukraine","United Arab Emirates (UAE)","United Kingdom (UK)","United States of America (USA)","Uruguay","Uzbekistan","Vanuatu",
            "Vatican City (Holy See)","Venezuela","Vietnam","Yemen","Zambia","Zimbabwe"};
                return paises;
    }
    //províncias do Japão
    public static String[] provincia(){
        String prov[] = new String[] { "Selecione a Província","Aichi", "Akita", "Aomori", "Chiba", "Ehime", "Fukui", "Fukuoka", 
                                        "Fukushima", "Gifu", "Gunma", "Hiroshima", "Hokkaido", "Hyogo", "Ibaraki", "Ishikawa", 
                                        "Iwate", "Kagawa", "Kagoshima", "Kanagawa", "Kochi", "Kumamoto", "Kyoto", "Mie", 
                                        "Miyagi", "Miyazaki", "Nagano", "Nagasaki", "Nara", "Niigata", "Oita", "Okayama", 
                                        "Okinawa", "Osaka", "Saga", "Saitama", "Shiga", "Shimane", "Shizuoka", "Tochigi", 
                                        "Tokushima", "Tokyo", "Tottori", "Toyama", "Wakayama", "Yamagata", "Yamaguchi", "Yamanashi" }; 
        return prov;
    }
    //anos para validade e expedição
    public static String[] dataAnos(){// expedição e validade de 
        String anos[]; 
        Date hoje = new Date();//data atual do sistema
        String formato = "yyyy";//formatoque eu quero pegar da data 
        SimpleDateFormat formatter = new SimpleDateFormat(formato);
        //instancio esse objeto passando o formato que eu quero 
        int anoatual;//esse metodo vai retornar o ano 
        anoatual = Integer.parseInt(formatter.format(hoje));
        int anomenos = anoatual - 15;
        int anomais = anoatual + 20;
        anos= new String[anoatual]; 
        anos[0]= "Anos";//esse campo é para no primeiro aparecer a palavra anos
        for (int i=1; anomenos<=anomais  ;i++){
            anos[i]=String.valueOf(anomenos);//aqui eu vou passando para o vetor os anos
            anomenos++;//aqui eu vou decrementando os anos
        } 
        return anos;
    }
    // meses do ano 
    public static String[] meses(){
        String mes[] = new String[] { "Mês","1","2","3","4","5","6","7","8","9","10","11","12"}; 
        return mes;
    }
    //dias do mes
    public static String[] dias(){
        String dia[] = new String[] { "Dia","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16",
                                    "17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}; 
        return dia;
    }
    /*--------------------------PERSONAL FIELDS THINGS----------------------------------------*/
    // estado civil
    public static String[] civil(){
        String[] civil = new String[]{"Selecione","Solteiro(a)","Casado(a)"};
        return civil;
    }
    
        
    
    //genre
    public static String[] genre(){
        String[] genre = new String[]{"Selecione","M","F"};
        return genre;
    }
    //escolaridade
    public static String[] school(){
        String[] school = new String[]{"Selecione","Fundamental Incompleto","Fundamental Completo",
            "Médio Incompleto","Médio Completo","Técnico Incompleto", "Técnico Completo", 
            "Superior Incompleto", "Superior Completo", "Pós-Graduação"};
        return school;
    }
    /*---------------------VISA THINGS-------------------------------------*/
    // visa status
    public static String[] visaStatus(){
        String[] visa = new String[]{"Selecione","Student",
                                    "Spouse or Child of Japanese National",
                                    "Spouse or Child of Permanent Resident",
                                    "Long Term Resident",
                                    "Permanent Resident"};
        return visa;
    }
    
    //visa periodo
    public static String[] visaLenght(){
        String[] visaLenght = new String[]{"6 meses","1 ano","3 anos","5 anos","****"};
        return visaLenght;
    }
    /*---------------------BANK THINGS--------------------------------------*/
    /*The follow methods will get the values from database*/
    //BANK TYPE
    public static String[] bankType(){
        String[] bankType = new String[]{"銀行","信用金庫","信用組合","信連"};
        return bankType;
    }
    
    //bank name
    public static String[] bankName(){
        String[] bankName = new String[]{"三菱東京ＵＦＪ","三井住友","みずほ","ゆうちょ","… "};
        return bankName;
    }
    //bank branch name
    public static String[] bankBranchName(){
        String[] bankBranchName = new String[]{"支店名","1","2","3","4","5"};
        return bankBranchName;
    }
    // bank branch number
    public static String[] bankBranchNum(){
        String[] bankBranchNum = new String[]{"支店番語","001", "002", "003" ,"004"};
        return bankBranchNum;
    }
    //account type
    public static String[] accountType() {
        String[] accountType = new String[]{"総合口座","普通口座","...","...","..."};
        return accountType;    
    }
}


