package br.com.algo.algorithms;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.StandardOpenOption.*;

public class Teste {

    public static void main(String[] args) {
        Teste t = new Teste();
        List<String> list = t.helper();

        list.forEach(arquivo -> {
            String[] separados = arquivo.split(",");
            t.escreveArquivo(separados[1].trim(), separados[0].trim());
        });
    }

    public void escreveArquivo(String fileName, String loginUsuario) {
        try {
            var nomeArquivo = "C:\\Users\\stefanini\\Desktop\\capovila\\" + fileName;
            File file = new File(nomeArquivo);
            Files.write(Paths.get(nomeArquivo), new String(loginUsuario + "\n").getBytes(), APPEND, CREATE);
            System.out.println("destino=home-dir ~~~ operacao=usuario-listado-em-arquivo ~~~ loginUsuario="+loginUsuario+" ~~~ arquivo="+fileName+".txt");
        } catch (Exception ex) {
            // Silencia porque este erro na gravação do arquivo não deve interromper a sincronização. Conforme a mensagem
            // do log, o erro pode ser identificado e corrigido.
            System.out.println("Erro ao adicionar login $loginUsuario ao arquivo $fileName.txt no diretório /mnt/sinc/SincHomeDir.\nMessage: "+ex.getMessage()+"\nCausa: "+ex.getCause());
        }
    }

    public List<String> helper() {
        return Arrays.asList(
                "X85862589546,usuarios-criados-no-Windows-AD-202209273-052347.txt",
                "X89160274115,usuarios-criados-no-Windows-AD-202209273-053655.txt",
                "X06488008145,usuarios-criados-no-Windows-AD-20220930-085654.txt",
                "X06808804109,usuarios-criados-no-Windows-AD-20220930-085654.txt",
                "X04315035165,usuarios-criados-no-Windows-AD-20220930-085654.txt",
                "X05488015507,usuarios-criados-no-Windows-AD-20220930-085654.txt",
                "X07510308135,usuarios-criados-no-Windows-AD-20220930-085654.txt",
                "X05587175197,usuarios-criados-no-Windows-AD-20220930-085654.txt",
                "X12138900983,usuarios-criados-no-Windows-AD-20220930-085654.txt",
                "X06039440198,usuarios-criados-no-Windows-AD-20220930-085654.txt",
                "X07389674326,usuarios-desabilitados-no-Windows-AD-20221003-081145.txt",
                "X03839384141,usuarios-criados-no-Windows-AD-202210276-034240.txt",
                "X04316305182,usuarios-criados-no-Windows-AD-202210276-064712.txt",
                "X00872542122,usuarios-desabilitados-no-Windows-AD-20221004-080349.txt",
                "X10182500187,usuarios-criados-no-Windows-AD-20221004-080349.txt",
                "X07609321150,usuarios-desabilitados-no-Windows-AD-20221004-080349.txt",
                "X70987102109,usuarios-criados-no-Windows-AD-202210277-030229.txt",
                "X03670559108,usuarios-criados-no-Windows-AD-202210277-035432.txt",
                "X08738438194,usuarios-criados-no-Windows-AD-202210277-064122.txt",
                "X80034364943,usuarios-desabilitados-no-Windows-AD-20221005-072842.txt",
                "X04804749403,usuarios-desabilitados-no-Windows-AD-20221005-072842.txt",
                "RAFAELBC,   ,usuarios-desabilitados-no-Windows-AD-20221005-072842.txt",
                "X00767393090,usuarios-criados-no-Windows-AD-20221005-072842.txt",
                "X07389674326,usuarios-criados-no-Windows-AD-20221005-072842.txt",
                "X01782816119,usuarios-desabilitados-no-Windows-AD-20221006-072952.txt",
                "LUCIANOFV   ,usuarios-desabilitados-no-Windows-AD-20221006-072952.txt",
                "X07634902101,usuarios-desabilitados-no-Windows-AD-20221006-072952.txt",
                "X04658959305,usuarios-desabilitados-no-Windows-AD-20221006-072952.txt",
                "X51625636172,usuarios-criados-no-Windows-AD-20221007-073507.txt",
                "Y01959705946,usuarios-desabilitados-no-Windows-AD-20221007-073507.txt",
                "X38107317149,usuarios-criados-no-Windows-AD-202210280-121629.txt",
                "X04402696100,usuarios-criados-no-Windows-AD-202210280-035310.txt",
                "X69492514168,usuarios-desabilitados-no-Windows-AD-20221008-073920.txt",
                "X73116688168,usuarios-desabilitados-no-Windows-AD-20221009-073555.txt",
                "X04071483105,usuarios-desabilitados-no-Windows-AD-20221009-073555.txt",
                "X06705541113,usuarios-desabilitados-no-Windows-AD-20221009-073555.txt",
                "X01350923966,usuarios-desabilitados-no-Windows-AD-20221009-073555.txt",
                "X05748334127,usuarios-desabilitados-no-Windows-AD-20221010-073311.txt",
                "X06600776129,usuarios-desabilitados-no-Windows-AD-20221010-073311.txt",
                "X44821947862,usuarios-desabilitados-no-Windows-AD-20221010-073311.txt",
                "X09789280670,usuarios-criados-no-Windows-AD-202210283-100534.txt",
                "X05358734767,usuarios-criados-no-Windows-AD-202210283-100702.txt",
                "X11867333732,usuarios-criados-no-Windows-AD-202210283-101126.txt",
                "X06722289478,usuarios-criados-no-Windows-AD-202210283-101251.txt",
                "X37975133809,usuarios-criados-no-Windows-AD-202210283-101448.txt",
                "X37253599896,usuarios-criados-no-Windows-AD-202210283-101625.txt",
                "X04527987100,usuarios-criados-no-Windows-AD-202210283-101741.txt",
                "X40903367831,usuarios-criados-no-Windows-AD-202210283-102005.txt",
                "X09014504489,usuarios-criados-no-Windows-AD-202210283-102201.txt",
                "X02943753505,usuarios-criados-no-Windows-AD-202210283-102336.txt",
                "X11226856969,usuarios-criados-no-Windows-AD-202210283-102541.txt",
                "X03674910101,usuarios-criados-no-Windows-AD-202210283-102740.txt",
                "X01965680135,usuarios-criados-no-Windows-AD-202210283-103141.txt",
                "X04736872160,usuarios-criados-no-Windows-AD-202210283-103326.txt",
                "X00193621100,usuarios-criados-no-Windows-AD-202210283-103505.txt",
                "X08644526758,usuarios-criados-no-Windows-AD-202210283-111943.txt",
                "X04235137379,usuarios-criados-no-Windows-AD-202210283-054322.txt",
                "X12002241759,usuarios-criados-no-Windows-AD-202210283-055035.txt",
                "X05311909196,usuarios-criados-no-Windows-AD-202210283-055432.txt",
                "X05808927196,usuarios-criados-no-Windows-AD-202210283-055913.txt",
                "X01339253151,usuarios-criados-no-Windows-AD-202210283-060201.txt",
                "X12410466702,usuarios-criados-no-Windows-AD-202210283-060359.txt",
                "X33683126850,usuarios-criados-no-Windows-AD-202210283-060544.txt",
                "X03638137562,usuarios-criados-no-Windows-AD-202210283-061127.txt",
                "X05354126142,usuarios-criados-no-Windows-AD-202210283-061422.txt",
                "X01722705027,usuarios-criados-no-Windows-AD-202210283-061543.txt",
                "X40450451801,usuarios-criados-no-Windows-AD-202210283-061754.txt",
                "X02814887548,usuarios-criados-no-Windows-AD-202210283-062128.txt",
                "X09097618681,usuarios-criados-no-Windows-AD-202210283-062323.txt",
                "X99418487187,usuarios-criados-no-Windows-AD-202210283-062559.txt",
                "X05521868305,usuarios-criados-no-Windows-AD-202210283-062754.txt",
                "X04336269173,usuarios-criados-no-Windows-AD-202210283-062921.txt",
                "X30213229803,usuarios-criados-no-Windows-AD-202210283-063116.txt",
                "X00998333107,usuarios-criados-no-Windows-AD-202210283-063250.txt",
                "X10196667739,usuarios-criados-no-Windows-AD-202210283-063445.txt",
                "X04624745507,usuarios-criados-no-Windows-AD-202210283-063610.txt",
                "X03175980236,usuarios-criados-no-Windows-AD-202210283-063748.txt",
                "NOGUEIRAS   ,usuarios-criados-no-Windows-AD-20221011-073728.txt",
                "X00961065141,usuarios-desabilitados-no-Windows-AD-20221011-073728.txt",
                "X10658928457,usuarios-desabilitados-no-Windows-AD-20221011-073728.txt",
                "X06905759120,usuarios-criados-no-Windows-AD-202210284-124404.txt",
                "X05841341421,usuarios-criados-no-Windows-AD-202210284-015222.txt",
                "X11036692493,usuarios-criados-no-Windows-AD-202210284-020020.txt",
                "X06950676131,usuarios-desabilitados-no-Windows-AD-20221012-073853.txt",
                "X09480866960,usuarios-criados-no-Windows-AD-20221014-072625.txt",
                "X07993312361,usuarios-criados-no-Windows-AD-20221014-072625.txt",
                "X42126682897,usuarios-criados-no-Windows-AD-20221014-072625.txt",
                "X07443457154,usuarios-desabilitados-no-Windows-AD-20221014-072625.txt",
                "X01995250139,usuarios-desabilitados-no-Windows-AD-20221014-072625.txt",
                "X01585947113,usuarios-desabilitados-no-Windows-AD-20221014-072625.txt",
                "X85381730900,usuarios-criados-no-Windows-AD-202210287-010414.txt",
                "X93727666234,usuarios-criados-no-Windows-AD-202210287-023254.txt",
                "X73053546191,usuarios-desabilitados-no-Windows-AD-20221015-073035.txt",
                "X04219896104,usuarios-desabilitados-no-Windows-AD-20221016-072543.txt",
                "X07748215154,usuarios-desabilitados-no-Windows-AD-20221016-072543.txt",
                "X07744167341,usuarios-desabilitados-no-Windows-AD-20221016-072543.txt",
                "X60220886318,usuarios-criados-no-Windows-AD-202210290-125251.txt",
                "X69770700134,usuarios-criados-no-Windows-AD-202210290-051312.txt",
                "X04219896104,usuarios-criados-no-Windows-AD-20221018-071801.txt",
                "X93809689572,usuarios-desabilitados-no-Windows-AD-20221018-071801.txt",
                "X44821947862,usuarios-criados-no-Windows-AD-20221018-071801.txt",
                "X07090186733,usuarios-criados-no-Windows-AD-202210291-100709.txt",
                "X93809689572,usuarios-desabilitados-no-Windows-AD-20221018-032110.txt",
                "X07388234730,usuarios-criados-no-Windows-AD-20221018-032110.txt",
                "X01795965193,usuarios-criados-no-Windows-AD-20221018-071752.txt",
                "X66952638172,usuarios-desabilitados-no-Windows-AD-20221019-072133.txt",
                "X04910534105,usuarios-desabilitados-no-Windows-AD-20221019-072133.txt",
                "X03483901140,usuarios-desabilitados-no-Windows-AD-20221019-072133.txt",
                "X11584691956,usuarios-desabilitados-no-Windows-AD-20221020-072229.txt",
                "X05281626167,usuarios-criados-no-Windows-AD-202210293-114915.txt",
                "X51197421220,usuarios-criados-no-Windows-AD-202210293-040831.txt",
                "X72889837220,usuarios-criados-no-Windows-AD-202210293-041100.txt",
                "X67705006200,usuarios-criados-no-Windows-AD-202210293-041313.txt",
                "X94284059220,usuarios-criados-no-Windows-AD-202210293-041639.txt"
                );
    }

}
