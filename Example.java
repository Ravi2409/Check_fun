import nz.sodium.*;
import swidgets.SButton;
import swidgets.SLabel;
import swidgets.STextField;

import javax.swing.*;
import java.awt.*;

import java.util.*;
import java.util.Timer;

/** 
 * An example of how to use the GpsService class
 */
public class Example {
    static Cell<String> latitude0= new Cell<>("Latitude");
    static Cell<String> longitude0= new Cell<>("Longitude");
    static Cell<String> distance0= new Cell<>("Distance");
    static Cell<String> latitude1= new Cell<>("Latitude");
    static Cell<String> longitude1= new Cell<>("Longitude");
    static Cell<String> distance1= new Cell<>("Distance");
    static Cell<String> latitude2= new Cell<>("Latitude");
    static Cell<String> longitude2= new Cell<>("Longitude");
    static Cell<String> distance2= new Cell<>("Distance");
    static Cell<String> latitude3= new Cell<>("Latitude");
    static Cell<String> longitude3= new Cell<>("Longitude");
    static Cell<String> distance3= new Cell<>("Distance");
    static Cell<String> latitude4= new Cell<>("Latitude");
    static Cell<String> longitude4= new Cell<>("Longitude");
    static Cell<String> distance4= new Cell<>("Distance");
    static Cell<String> latitude5= new Cell<>("Latitude");
    static Cell<String> longitude5= new Cell<>("Longitude");
    static Cell<String> distance5= new Cell<>("Distance");
    static Cell<String> latitude6= new Cell<>("Latitude");
    static Cell<String> longitude6= new Cell<>("Longitude");
    static Cell<String> distance6= new Cell<>("Distance");
    static Cell<String> latitude7= new Cell<>("Latitude");
    static Cell<String> longitude7= new Cell<>("Longitude");
    static Cell<String> distance7= new Cell<>("Distance");
    static Cell<String> latitude8= new Cell<>("Latitude");
    static Cell<String> longitude8= new Cell<>("Longitude");
    static Cell<String> distance8= new Cell<>("Distance");
    static Cell<String> latitude9= new Cell<>("Latitude");
    static Cell<String> longitude9= new Cell<>("Longitude");
    static Cell<String> distance9= new Cell<>("Distance");

    static Cell<String> Tracker_label0= new Cell<>("Tracker0");
    static Cell<String> Tracker_label1= new Cell<>("Tracker1");
    static Cell<String> Tracker_label2= new Cell<>("Tracker2");
    static Cell<String> Tracker_label3= new Cell<>("Tracker3");
    static Cell<String> Tracker_label4= new Cell<>("Tracker4");
    static Cell<String> Tracker_label5= new Cell<>("Tracker5");
    static Cell<String> Tracker_label6= new Cell<>("Tracker6");
    static Cell<String> Tracker_label7= new Cell<>("Tracker7");
    static Cell<String> Tracker_label8= new Cell<>("Tracker8");
    static Cell<String> Tracker_label9= new Cell<>("Tracker9");

    static Cell<String> Latest_Event_label= new Cell<>("Latest Event");
    static Cell<String> Filtered_Event_label= new Cell<>("Filtered Event");
    static Cell<String> Control_panel= new Cell<>("Control Panel");
    static Cell<String> Lat_LB= new Cell<>("LatLB");
    static Cell<String> Lat_UB= new Cell<>("LatUB");
    static Cell<String> Long_LB= new Cell<>("LongLB");
    static Cell<String> Long_UB= new Cell<>("LongUB");

    public static SLabel lat100= new SLabel(latitude0);
    public static SLabel long100= new SLabel(longitude0);
    public static SLabel dist100= new SLabel(distance0);

    public static SLabel lat101= new SLabel(latitude1);
    public static SLabel long101= new SLabel(longitude1);
    public static SLabel dist101= new SLabel(distance1);
    public static SLabel lat102= new SLabel(latitude2);
    public static SLabel long102= new SLabel(longitude2);
    public static SLabel dist102= new SLabel(distance2);

    public static SLabel lat103= new SLabel(latitude3);
    public static SLabel long103= new SLabel(longitude3);
    public static SLabel dist103= new SLabel(distance3);

    public static SLabel lat104= new SLabel(latitude4);
    public static SLabel long104= new SLabel(longitude4);
    public static SLabel dist104= new SLabel(distance4);

    public static SLabel lat105= new SLabel(latitude5);
    public static SLabel long105= new SLabel(longitude5);
    public static SLabel dist105= new SLabel(distance5);

    public static SLabel lat106= new SLabel(latitude6);
    public static SLabel long106= new SLabel(longitude6);
    public static SLabel dist106= new SLabel(distance6);
    public static SLabel lat107= new SLabel(latitude7);
    public static SLabel long107= new SLabel(longitude7);
    public static SLabel dist107= new SLabel(distance7);
    public static SLabel lat108= new SLabel(latitude8);
    public static SLabel long108= new SLabel(longitude8);
    public static SLabel dist108= new SLabel(distance8);
    public static SLabel lat109= new SLabel(latitude9);
    public static SLabel long109= new SLabel(longitude9);
    public static SLabel dist109= new SLabel(distance9);
    /// Label of Tracker
    public static SLabel Tracker0= new SLabel(Tracker_label0);
    public static SLabel Tracker1= new SLabel (Tracker_label1);
    public static SLabel Tracker2= new SLabel(Tracker_label2);
    public static SLabel Tracker3= new SLabel(Tracker_label3);
    public static SLabel Tracker4= new SLabel(Tracker_label4);
    public static SLabel Tracker5= new SLabel(Tracker_label5);
    public static SLabel Tracker6= new SLabel(Tracker_label6);
    public static SLabel Tracker7= new SLabel(Tracker_label7);
    public static SLabel Tracker8= new SLabel(Tracker_label8);
    public static SLabel Tracker9= new SLabel(Tracker_label9);

    public static SLabel Latest_Event= new SLabel(Latest_Event_label);
    public static SLabel Filtered_Event= new SLabel(Filtered_Event_label);

    public static SLabel control_panel= new SLabel(Control_panel);
    public static SLabel lat_lb= new SLabel(Lat_LB);
    public static SLabel lat_ub= new SLabel(Lat_UB);
    public static SLabel long_lb= new SLabel(Long_LB);
    public static SLabel long_ub= new SLabel(Long_UB);

    ///Data stored in STextField
    static STextField Tracker0_lat= new STextField("");
    static STextField Tracker1_lat=new STextField("");
    static STextField Tracker2_lat=new STextField("");
    static STextField Tracker3_lat=new STextField("");
    static STextField Tracker4_lat=new STextField("");
    static STextField Tracker5_lat=new STextField("");
    static STextField Tracker6_lat=new STextField("");
    static STextField Tracker7_lat=new STextField("");
    static STextField Tracker8_lat=new STextField("");
    static STextField Tracker9_lat=new STextField("");
    static STextField Tracker0_long=new STextField("");
    static STextField Tracker1_long=new STextField("");
    static STextField Tracker2_long=new STextField("");
    static STextField Tracker3_long=new STextField("");
    static STextField Tracker4_long=new STextField("");
    static STextField Tracker5_long=new STextField("");
    static STextField Tracker6_long=new STextField("");
    static STextField Tracker7_long=new STextField("");
    static STextField Tracker8_long=new STextField("");
    static STextField Tracker9_long=new STextField("");
    static STextField Tracker0_dist=new STextField("");
    static STextField Tracker1_dist=new STextField("");
    static STextField Tracker2_dist=new STextField("");
    static STextField Tracker3_dist=new STextField("");
    static STextField Tracker4_dist=new STextField("");
    static STextField Tracker5_dist=new STextField("");
    static STextField Tracker6_dist=new STextField("");
    static STextField Tracker7_dist=new STextField("");
    static STextField Tracker8_dist=new STextField("");
    static STextField Tracker9_dist=new STextField("");
    static STextField Latest_Event_text= new STextField("");
    static STextField Filtered_Event_text=new STextField("");

    static STextField lat_lower_bound= new STextField("-90");
    static STextField lat_upper_bound =new STextField("90");
    static STextField long_lower_bound= new STextField("-180");
    static STextField long_upper_bound= new STextField("180");
    static STextField b1=new STextField("");
    static STextField b2=new STextField("");
    static STextField b3=new STextField("");
    static STextField b4=new STextField("");
    static SButton Set= new SButton("Set");

    static Double[] distance = new Double[10];

    static double currentLatitude = 0;
    static double currentLongitude = 0;
    static double currentaltitude = 0;
    static int counter =0;
    static String combine ;
//    LocalTime lt= LocalTime.now();
static Timer  current_time = new Timer();
    public static void main(String[] args)

    {

        // Initialise the GPS Service
        GpsService serv = new GpsService();
        // Retrieve Event Streams
        Stream<GpsEvent>[] streams = serv.getEventStreams();

        // Attach a handler method to each stream

        for(Stream<GpsEvent> s : streams){
            s.listen((GpsEvent ev) -> {
        //Print the current stream if needed
        //System.out.println(ev);
                //Task 1
                    Front_end(ev);
                    // Task 2
                    Update_timecheck(ev);


            } );
        }

        //Task 3
        for(Stream<GpsEvent> s : streams){
            s.listen((GpsEvent ev1) ->
            {
                ArrayList<String> temp= new ArrayList<>();
                //putting the text receieved from STEXT field
                    temp.add(lat_lower_bound.getText());
                    temp.add(lat_upper_bound.getText());
                    temp.add(long_lower_bound.getText());
                    temp.add(long_upper_bound.getText());
                    System.out.println(temp);
                    double d1=Double.parseDouble(temp.get(0));
                    double d2=Double.parseDouble(temp.get(1));
                    double d3=Double.parseDouble(temp.get(2));
                    double d4=Double.parseDouble(temp.get(3));
                    //Setting the FilterEvent field according to the condition
                 if(ev1.latitude > d1 && ev1.latitude<d2 && ev1.longitude > d3 && ev1.longitude<d4)
                 {
                     String tempo=ev1.name+','+ev1.latitude+','+ev1.longitude+','+ev1.altitude;
                     System.out.println(tempo);
//                     Set.sClicked.map(u->Filtered_Event_text.setText(tempo));
                 }


            });}
//
        FlowLayout fl= new FlowLayout();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(fl);
        frame.add(Tracker0);
        //"Latitude label
        frame.add(lat100);
        //Latitude value from stream
        frame.add(Tracker0_lat);
//  /   longitude label
        frame.add(long100);
        //longitude value from stream
        frame.add(Tracker0_long);
        //distance label
        frame.add(dist100);
        //distance value after calculation
        frame.add(Tracker0_dist);
        //Tracker 1 label
        frame.add(Tracker1);
        //"Latitude label
        frame.add(lat101);
        //Latitude value from stream
        frame.add(Tracker1_lat);
//  /   longitude label
       frame.add(long101);
        //longitude value from stream
        frame.add(Tracker1_long);
        //distance label
        frame.add(dist101);
        //distance value after calculation
        frame.add(Tracker1_dist);
        //Tracker 0 label
        frame.add(Tracker2);
        //"Latitude label
        frame.add(lat102);
        //Latitude value from stream
        frame.add(Tracker2_lat);
//  /   longitude label
        frame.add(long102);
        //longitude value from stream
        frame.add(Tracker2_long);
        //distance label
       frame.add(dist102);
        //distance value after calculation
        frame.add(Tracker2_dist);
        frame.add(Tracker3);
//        //"Latitude label
        frame.add(lat103);
//        //Latitude value from stream
        frame.add(Tracker3_lat);
////  /   longitude label
        frame.add(long103);
//        //longitude value from stream
        frame.add(Tracker3_long);
//        //distance label
        frame.add(dist103);
//        //distance value after calculation
        frame.add(Tracker3_dist);
////
        frame.add(Tracker4);
//        //"Latitude label
        frame.add(lat104);
//        //Latitude value from stream
        frame.add(Tracker4_lat);
////  /   longitude label
        frame.add(long104);
//        //longitude value from stream
        frame.add(Tracker4_long);
//        //distance label
        frame.add(dist104);
//        //distance value after calculation
        frame.add(Tracker4_dist);
//
        frame.add(Tracker5);
//        //"Latitude label
        frame.add(lat105);
//        //Latitude value from stream
        frame.add(Tracker5_lat);
////  /   longitude label
        frame.add(long105);
//        //longitude value from stream
        frame.add(Tracker5_long);
//        //distance label
        frame.add(dist105);
//        //distance value after calculation
        frame.add(Tracker5_dist);
        frame.add(Tracker6);
//        //"Latitude label
        frame.add(lat106);
//        //Latitude value from stream
        frame.add(Tracker6_lat);
////  /   longitude label
        frame.add(long106);
//        //longitude value from stream
        frame.add(Tracker6_long);
//        //distance label
        frame.add(dist106);
//        //distance value after calculation
        frame.add(Tracker6_dist);
        frame.add(Tracker7);
//        //"Latitude label
        frame.add(lat107);
//        //Latitude value from stream
        frame.add(Tracker7_lat);
////  /   longitude label
        frame.add(long107);
//        //longitude value from stream
        frame.add(Tracker7_long);
//        //distance label
        frame.add(dist107);
//        //distance value after calculation
        frame.add(Tracker7_dist);
        frame.add(Tracker8);
//        //"Latitude label
        frame.add(lat108);
//        //Latitude value from stream
        frame.add(Tracker8_lat);
////  /   longitude label
        frame.add(long108);
//        //longitude value from stream
        frame.add(Tracker8_long);
//        //distance label
        frame.add(dist108);
//        //distance value after calculation
        frame.add(Tracker8_dist);
//
        frame.add(Tracker9);
//        //"Latitude label
        frame.add(lat109);
//        //Latitude value from stream
        frame.add(Tracker9_lat);
////  /   longitude label
        frame.add(long109);
//        //longitude value from stream
        frame.add(Tracker9_long);
//        //distance label
        frame.add(dist109);
//        //distance value after calculation
        frame.add(Tracker9_dist);
        frame.add(Latest_Event);
        frame.add(Latest_Event_text);
        frame.add(Filtered_Event);
        frame.add(Filtered_Event_text);
        frame.add(control_panel);
        frame.add(lat_lb);
        frame.add(lat_lower_bound);
        frame.add(lat_ub);
        frame.add(lat_upper_bound);
        frame.add(long_lb);
        frame.add(long_lower_bound);
        frame.add(long_ub);
        frame.add(long_upper_bound);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(Set);
        frame.setLocationRelativeTo(null);
        frame.setSize(720, 600);
        frame.setVisible(true);

    }


    public static void Front_end(GpsEvent ev)
    {
//            set.Sclicked.map()

        if (ev.name.replace("Tracker", "").equals("0")) {
            distance[0] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            distance[0] = Math.sqrt(Math.pow(distance[0], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));

            Tracker0_lat.setText(String.valueOf(ev.latitude));
            Tracker0_long.setText(String.valueOf(ev.longitude));
            Tracker0_dist.setText(String.valueOf(distance[0]));

        } else if (ev.name.replace("Tracker", "").equals("1")) {
            distance[1] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            distance[1] = Math.sqrt(Math.pow(distance[1], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            Tracker1_lat.setText(String.valueOf(ev.latitude));
            Tracker1_long.setText(String.valueOf(ev.longitude));
            Tracker1_dist.setText(String.valueOf(distance[1]));
        } else if (ev.name.replace("Tracker", "").equals("2")) {
            distance[2] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            distance[2] = Math.sqrt(Math.pow(distance[2], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            Tracker2_lat.setText(String.valueOf(ev.latitude));
            Tracker2_long.setText(String.valueOf(ev.longitude));
            Tracker2_dist.setText(String.valueOf(distance[2]));
        } else if (ev.name.replace("Tracker", "").equals("3")) {
            distance[3] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            distance[3] = Math.sqrt(Math.pow(distance[3], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            Tracker3_lat.setText(String.valueOf(ev.latitude));
            Tracker3_long.setText(String.valueOf(ev.longitude));
            Tracker3_dist.setText(String.valueOf(distance[3]));
        } else if (ev.name.replace("Tracker", "").equals("4")) {
            distance[4] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            distance[4] = Math.sqrt(Math.pow(distance[4], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            Tracker4_lat.setText(String.valueOf(ev.latitude));
            Tracker4_long.setText(String.valueOf(ev.longitude));
            Tracker4_dist.setText(String.valueOf(distance[4]));
        } else if (ev.name.replace("Tracker", "").equals("5")) {
            distance[5] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            distance[5] = Math.sqrt(Math.pow(distance[5], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            Tracker5_lat.setText(String.valueOf(ev.latitude));
            Tracker5_long.setText(String.valueOf(ev.longitude));
            Tracker5_dist.setText(String.valueOf(distance[5]));
        } else if (ev.name.replace("Tracker", "").equals("6")) {
            distance[6] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            distance[6] = Math.sqrt(Math.pow(distance[6], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            Tracker6_lat.setText(String.valueOf(ev.latitude));
            Tracker6_long.setText(String.valueOf(ev.longitude));
            Tracker6_dist.setText(String.valueOf(distance[6]));
        } else if (ev.name.replace("Tracker", "").equals("7")) {
            distance[7] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            distance[7] = Math.sqrt(Math.pow(distance[7], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            Tracker7_lat.setText(String.valueOf(ev.latitude));
            Tracker7_long.setText(String.valueOf(ev.longitude));
            Tracker7_dist.setText(String.valueOf(distance[7]));
        } else if (ev.name.replace("Tracker", "").equals("8")) {
            distance[8] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            distance[8] = Math.sqrt(Math.pow(distance[8], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            Tracker8_lat.setText(String.valueOf(ev.latitude));
            Tracker8_long.setText(String.valueOf(ev.longitude));
            Tracker8_dist.setText(String.valueOf(distance[8]));
        }
        else if (ev.name.replace("Tracker", "").equals("9"))
        {
            distance[9] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            distance[9] = Math.sqrt(Math.pow(distance[9], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            Tracker9_lat.setText(String.valueOf(ev.latitude));
            Tracker9_long.setText(String.valueOf(ev.longitude));
            Tracker9_dist.setText(String.valueOf(distance[9]));
        }
//        else if(Set.sClicked)
//      else if(){

//            Filtered_Event_text.setText(combine);
//        }
//            else if(Set.sClicked())
    }
    public static void Update_timecheck(GpsEvent ev)
    {
        combine=ev.name+','+ev.latitude+','+ev.longitude+','+ev.altitude;
        Latest_Event_text.setText(combine);
        current_time.cancel();
//        timerTask.cancel();
        TimerTask timerTask= new TimerTask() {
            @Override
            public void run() {
                System.out.println("");

            }
        };
    }

}
