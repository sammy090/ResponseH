package TestData.IV.CDP;


import org.testng.Assert;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class CDPHeaders {


    public void CDPHeaderCanada() throws Exception {


        URL obj = new URL("http://www.ivivva.com/products/category/girls-tops?pagesize=All");
        URLConnection conn = obj.openConnection();

        conn.setRequestProperty("Host", "www.ivivva.com");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0");
        conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
        conn.setRequestProperty("Cookie", "JSESSIONID=2EB511E2B84CEA5F61F92B91E2B703CD; UsrLocale=en_CA; Country=CA; ca_ord=zSOyszYhpzPPMcX81X0GOA==; isLoggedin=false; cartCount=0; NSC_mvmvmfnpo_jwjwwb_qspew10_mc=ffffffff09c943d845525d5f4f58455e445a4a4229a0; akavpau_vp_ivivva_www=1483981603~id=22623f14ebe89bead64431220fec1f9a; sandy-session-id=5d741ceff9b140fe; sandy-client-id=f158486f1b3eacae; omniID=1483981025443Wm6t; mbox=session#1483981025457-883819#1483983168|check#true#1483981368; _ga=GA1.2.712422482.1483981026; _gat_mobifyTracker=1; s_cc=true; s_fid=76420913BC202706-10AAC337AB4D3BAC; c_m2=1; c_m=undefinedDirect%20LoadDirect%20Load; s_nr=1483981307727; s_vnum=1486573026596%26vn%3D1; s_invisit=true; s_lv=1483981307729; s_lv_s=First%20Visit; s_sq=%5B%5BB%5D%5D; BTT_X0siD=549953299248642563; BTT_Collect=on; sl=CA; __utma=210616138.712422482.1483981026.1483981028.1483981028.1; __utmb=210616138.13.7.1483981307696; __utmc=210616138; __utmz=210616138.1483981028.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmt_ga=1; s_vi=[CS]v1|2C39E072851D1315-6000190E800426A4[CE]; NSC_JOor3tnbcwc1l2hdtpjjr5dyiriurdc=ffffffff09c943d645525d5f4f58455e445a4a423660; emailSignupCDPCookie=true; BTT_WCD_Collect=off");
        conn.setRequestProperty("Pragma", "akamai-x-cache-on, akamai-x-cache-remote-on, akamai-x-check-cacheable, akamai-x-get-cache-key, akamai-x-get-extracted-values, akamai-x-get-nonces, akamai-x-get-ssl-client-session-id, akamai-x-get-true-cache-key, akamai-x-serial-no");
        conn.setRequestProperty("Connection", "keep-alive");
        conn.setRequestProperty("Upgrade-Insecure-Requests", "1");
        conn.setRequestProperty("Cache-Control", "max-age=0");
        Map<String, List<String>> map = conn.getHeaderFields();
        System.out.println("Printing Response Header...\n");
        System.out.println("This test is for Guest user with userlocale present\n");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " ,Value : " + entry.getValue());
        }

        Assert.assertEquals("YES", conn.getHeaderField("X-Check-Cacheable"));
        Assert.assertEquals("/L/8125/250672/1h/www.ivivva.com/products/category/girls-tops cid=pagesize=All_UsrLocale=en_CA&Country=CA&cartCount=0_", conn.getHeaderField("X-Cache-Key"));
    }

    public void CDPHeaderUSA() throws Exception {

        URL obj = new URL("http://www.ivivva.com/products/category/girls-hoodies?pagesize=All");
        URLConnection conn = obj.openConnection();

        conn.setRequestProperty("Host", "www.ivivva.com");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0");
        conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        conn.setRequestProperty("Accept-Encoding", "gzip, deflate");
        conn.setRequestProperty("Cookie", "JSESSIONID=2EB511E2B84CEA5F61F92B91E2B703CD; UsrLocale=en_US; Country=US; ca_ord=zSOyszYhpzPPMcX81X0GOA==; isLoggedin=false; cartCount=0; NSC_mvmvmfnpo_jwjwwb_qspew10_mc=ffffffff09c943d845525d5f4f58455e445a4a4229a0; akavpau_vp_ivivva_www=1483982545~id=ac5ff5d056d038337bb5eb4d883a233d; sandy-session-id=5d741ceff9b140fe; sandy-client-id=f158486f1b3eacae; omniID=1483981025443Wm6t; mbox=session#1483981025457-883819#1483984108|check#true#1483982308; _ga=GA1.2.712422482.1483981026; s_cc=true; s_fid=76420913BC202706-10AAC337AB4D3BAC; c_m2=1; c_m=undefinedDirect%20LoadDirect%20Load; s_nr=1483982247851; s_vnum=1486573026596%26vn%3D1; s_invisit=true; s_lv=1483982247854; s_lv_s=First%20Visit; s_sq=%5B%5BB%5D%5D; BTT_X0siD=549953299248642563; BTT_Collect=on; sl=US; __utma=210616138.712422482.1483981026.1483981028.1483981028.1; __utmb=210616138.30.7.1483982248582; __utmc=210616138; __utmz=210616138.1483981028.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); s_vi=[CS]v1|2C39E072851D1315-6000190E800426A4[CE]; NSC_JOor3tnbcwc1l2hdtpjjr5dyiriurdc=ffffffff09c943d645525d5f4f58455e445a4a423660; emailSignupCDPCookie=true; BTT_WCD_Collect=off; regionMsgShown=true; us_ord=hYKJLxrXVQIHx9rAIKCSQw==; _gat_mobifyTracker=1; __utmt_ga=1");
        conn.setRequestProperty("Pragma", "akamai-x-cache-on, akamai-x-cache-remote-on, akamai-x-check-cacheable, akamai-x-get-cache-key, akamai-x-get-extracted-values, akamai-x-get-nonces, akamai-x-get-ssl-client-session-id, akamai-x-get-true-cache-key, akamai-x-serial-no");
        conn.setRequestProperty("Connection", "keep-alive");
        conn.setRequestProperty("Upgrade-Insecure-Requests", "1");
        conn.setRequestProperty("Cache-Control", "max-age=0");
        Map<String, List<String>> map = conn.getHeaderFields();
        System.out.println("Printing Response Header...\n");
        System.out.println("This test is for Guest user with userlocale present\n");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " ,Value : " + entry.getValue());
        }


        Assert.assertEquals("YES", conn.getHeaderField("X-Check-Cacheable"));
        Assert.assertEquals("/L/8125/250672/1h/www.ivivva.com/products/category/girls-hoodies cid=pagesize=All_UsrLocale=en_US&Country=US&cartCount=0_", conn.getHeaderField("X-Cache-Key"));




    }

}
