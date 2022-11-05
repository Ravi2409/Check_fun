import javax.swing.*;
import nz.sodium.*;
import swidgets.SLabel;
import swidgets.STextField;

import java.awt.*;

/**
 * An example of how to use the GpsService class
 */

public class FrontEnd_UI  extends JPanel{

    static Cell<String> labels= new Cell<>("Tracker0");

   public static SLabel Tracker0= new SLabel(labels);
    public static STextField Tracker0_lat= new STextField("");
    STextField Tracker1_lat=new STextField("");
    STextField Tracker2_lat=new STextField("");
    STextField Tracker3_lat=new STextField("");
    STextField Tracker4_lat=new STextField("");
    STextField Tracker5_lat=new STextField("");
    STextField Tracker6_lat=new STextField("");
    STextField Tracker7_lat=new STextField("");
    STextField Tracker8_lat=new STextField("");
    STextField Tracker9_lat=new STextField("");
    STextField Tracker0_long=new STextField("");
    STextField Tracker1_long=new STextField("");
    STextField Tracker2_long=new STextField("");
    STextField Tracker3_long=new STextField("");
    STextField Tracker4_long=new STextField("");
    STextField Tracker5_long=new STextField("");
    STextField Tracker6_long=new STextField("");
    STextField Tracker7_long=new STextField("");
    STextField Tracker8_long=new STextField("");
    STextField Tracker9_long=new STextField("");
    STextField Tracker0_dist=new STextField("");
    STextField Tracker1_dist=new STextField("");
    STextField Tracker2_dist=new STextField("");
    STextField Tracker3_dist=new STextField("");
    STextField Tracker4_dist=new STextField("");
    STextField Tracker5_dist=new STextField("");
    STextField Tracker6_dist=new STextField("");
    STextField Tracker7_dist=new STextField("");
    STextField Tracker8_dist=new STextField("");
    STextField Tracker9_dist=new STextField("");
    STextField Latest_Event;
    STextField Filtered_Event;

    STextField lat_lower_bound;
    STextField lat_upper_bound;
    STextField long_lower_bound;
    STextField long_upper_bound;
    STextField b1;
    STextField b2;
    STextField b3;
    STextField b4;

    Double[] distance = new Double[10];

    static double currentLatitude = 0;
    static double currentLongitude = 0;
    static double currentaltitude = 0;

    public static void Front_end(GpsEvent ev)
    {
        FrontEnd_UI f1= new FrontEnd_UI();
        if (ev.name.replace("Tracker", "").equals("0")) {
            f1.distance[0] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            f1.distance[0] = Math.sqrt(Math.pow(f1.distance[0], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));

            f1.Tracker0_lat.setText(String.valueOf(ev.latitude));
            f1.Tracker0_long.setText(String.valueOf(ev.longitude));
            f1.Tracker0_dist.setText(String.valueOf(f1.distance[0]));
        } else if (ev.name.replace("Tracker", "").equals("1")) {
            f1.distance[1] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            f1.distance[1] = Math.sqrt(Math.pow(f1.distance[1], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            f1.Tracker1_lat.setText(String.valueOf(ev.latitude));
            f1.Tracker1_long.setText(String.valueOf(ev.longitude));
            f1.Tracker1_dist.setText(String.valueOf(f1.distance[1]));
        } else if (ev.name.replace("Tracker", "").equals("2")) {
            f1.distance[2] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            f1.distance[2] = Math.sqrt(Math.pow(f1.distance[2], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            f1.Tracker2_lat.setText(String.valueOf(ev.latitude));
            f1.Tracker2_long.setText(String.valueOf(ev.longitude));
            f1.Tracker2_dist.setText(String.valueOf(f1.distance[2]));
        } else if (ev.name.replace("Tracker", "").equals("3")) {
            f1.distance[3] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            f1.distance[3] = Math.sqrt(Math.pow(f1.distance[3], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            f1.Tracker3_lat.setText(String.valueOf(ev.latitude));
            f1.Tracker3_long.setText(String.valueOf(ev.longitude));
            f1.Tracker3_dist.setText(String.valueOf(f1.distance[3]));
        } else if (ev.name.replace("Tracker", "").equals("4")) {
            f1.distance[4] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            f1.distance[4] = Math.sqrt(Math.pow(f1.distance[4], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            f1.Tracker4_lat.setText(String.valueOf(ev.latitude));
            f1.Tracker4_long.setText(String.valueOf(ev.longitude));
            f1.Tracker4_dist.setText(String.valueOf(f1.distance[4]));
        } else if (ev.name.replace("Tracker", "").equals("5")) {
            f1.distance[5] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            f1.distance[5] = Math.sqrt(Math.pow(f1.distance[5], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            f1.Tracker5_lat.setText(String.valueOf(ev.latitude));
            f1.Tracker5_long.setText(String.valueOf(ev.longitude));
            f1.Tracker5_dist.setText(String.valueOf(f1.distance[5]));
        } else if (ev.name.replace("Tracker", "").equals("6")) {
            f1.distance[6] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            f1.distance[6] = Math.sqrt(Math.pow(f1.distance[6], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            f1.Tracker6_lat.setText(String.valueOf(ev.latitude));
            f1.Tracker6_long.setText(String.valueOf(ev.longitude));
            f1.Tracker6_dist.setText(String.valueOf(f1.distance[6]));
        } else if (ev.name.replace("Tracker", "").equals("7")) {
            f1.distance[6] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            f1.distance[6] = Math.sqrt(Math.pow(f1.distance[6], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            f1.Tracker7_lat.setText(String.valueOf(ev.latitude));
            f1.Tracker7_long.setText(String.valueOf(ev.longitude));
            f1.Tracker7_dist.setText(String.valueOf(f1.distance[7]));
        } else if (ev.name.replace("Tracker", "").equals("8")) {
            f1.distance[8] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            f1.distance[8] = Math.sqrt(Math.pow(f1.distance[8], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            f1.Tracker8_lat.setText(String.valueOf(ev.latitude));
            f1.Tracker8_long.setText(String.valueOf(ev.longitude));
            f1.Tracker8_dist.setText(String.valueOf(f1.distance[8]));
        } else if (ev.name.replace("Tracker", "").equals("9")) {
            f1.distance[9] = 2 * 6378100 * Math.asin(Math.sqrt((Math.pow(Math.sin((currentLatitude - ev.latitude) / 2), 2) + (Math.cos(currentLatitude) * Math.cos(ev.latitude) * (Math.pow(Math.sin((currentLongitude - ev.longitude) / 2), 2))))));
            f1.distance[9] = Math.sqrt(Math.pow(f1.distance[9], 2) + Math.pow((currentaltitude * 0.3048 - ev.altitude * 0.3048), 2));
            f1.Tracker9_lat.setText(String.valueOf(ev.latitude));
            f1.Tracker9_long.setText(String.valueOf(ev.longitude));
            f1.Tracker9_dist.setText(String.valueOf(f1.distance[9]));
        }

    }

    public static void main(String[] args)
    {
        FlowLayout fl= new FlowLayout();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(fl);
        frame.add(Tracker0);
        frame.add(Tracker0_lat);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }
    }


