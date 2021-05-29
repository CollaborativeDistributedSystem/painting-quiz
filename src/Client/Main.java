package Client;

public class Main {
    static public void main(String[] args) {
        String id=null,ip=null,ans=null;
        Controller Socket = new Controller();
        MainDesign design = new MainDesign();
        initDesign init = new initDesign();
        init.makeFrame();
        do {
            id = init.getID();
            ip = init.getIP();
            ans = init.getANS();
            System.out.println("");
        }while(id==null || ip==null || ans==null);
        Socket.setIP(ip);
        Socket.setPort(8888);
        Socket.setId(id);
        Socket.setAns(ans);
        design.makeFrame();
        Socket.start();
        Socket.setAnswerField(design.getAnswerField());
        Socket.setScreen(design.getScreen());
        Socket.setBrush(design.getBrush());
        Socket.setImgbuff(design.getImgbuff());
    }
}