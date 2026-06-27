package in.co.nmsworks.training.week2.day3;

import javax.xml.bind.SchemaOutputResolver;

public class Report {


    public String header()
    {
//        System.out.println("HEADER");
        return " Header ";
    }

    public String footer()
    {
//        System.out.println("Footer");
        return " Footer ";
    }

    public String body()
    {
//        System.out.println("Body");
        return " Body ";
    }

    public String generate()
    {
        return header()+body()+footer();
    }

}
