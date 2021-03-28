import java.util.ArrayList;
import java.util.List;

public class Sample {

    int id;
    String name;
    String address;

    public Sample(int id,String name,String address)
    {

        this.id = id;
        this.address = address;
        this.name = name;


    }
public static void main(String[] args)
{

    Sample obj = new Sample(1,"Shubham","Pune");
            Sample    obj1 = new Sample(2,"Raj","raipur");
            Sample obj2 = new Sample(3,"Karan","ramu");

            List<Sample> list = new ArrayList<>();
            list.add(obj);
            list.add(obj1);
            list.add(obj2);

            list.forEach(s->{

                System.out.println("id=>"+s.id);
                System.out.println("name=>"+s.name);
                System.out.println("address=>"+s.address);

                    }
                    );



}


}
