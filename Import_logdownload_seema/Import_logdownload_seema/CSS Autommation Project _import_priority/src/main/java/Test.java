import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test {

    public void test123() throws ParseException {
        Instant instant = Instant.ofEpochMilli(Long.parseLong("1641358090508"));
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.mmm");
        System.out.println("Date:"+fmt.format(instant.atZone(ZoneId.of("GMT+05:30"))));
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.mmm");
        String str = formatter.format(date);
        long epoch = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(str).getTime() / 1000;

        //System.out.println("Date:"+fmt.parse("01/12/2022 07:39:51"));
    }
}
