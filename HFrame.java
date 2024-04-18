import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Hframe extends JFrame {
    HPanel jp1=new HPanel();
    JButton jb1=new JButton("打开");
    JPanel jp2=new JPanel();
    public void init(){
        setLayout(new GridLayout(2,1));
        jp1.setBackground(new Color(16, 205, 220));
        jp2.setBackground(new Color(16, 205, 220));
        setBounds(300,300,500,300);
        setTitle("节日快乐");
        setVisible(true);
        add(jp1);
        add(jp2);
        jp2.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp2.add(jb1);
        jb1.setPreferredSize(new Dimension(100,40));
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                H3Frame h3Frame=new H3Frame();
                h3Frame.init();
                h3Frame.jb2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        H4Frame h4Frame=new H4Frame("给你一片春光，愿你心情始终舒畅；");
                        h4Frame.init();
                    }
                });
                setVisible(false);
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        Hframe h=new Hframe();
        h.init();
    }
}
class HPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("黑体",Font.BOLD,20));
        g.drawString("3.8女生节快乐",20,50);
        g.drawString("请查收你的节日祝福ヾ(≧▽≦*)o",20,100);
    }
}
class H2Frame extends JFrame{
    H2Panel jp3=new H2Panel();
    JButton jb1=new JButton("好！");
     public void init(){
     setBounds(300,300,500,300);
     setVisible(true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     jp3.setBackground(new Color(255, 166, 246));
     add(jp3);
     jp3.setLayout(null);
     jb1.setBounds(390,210,75,30);
     jp3.add(jb1);
     setTitle("To温莹莹:");
    jb1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
     }
}
class H2Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Toolkit tool = this.getToolkit();
        Image img = tool.getImage("src/hua.png");
        g.drawImage(img, 0, 10, 200, 200, this);
        g.setFont(new Font("楷体",Font.BOLD,22));
        g.drawString("送你一束鲜花",200,50);
        g.drawString("愿你永远开心",200,80);
        g.drawString("让烦恼统统走开",200,110);
        g.drawString("充满意义的过好每一天",200,140);
    }
}
class H3Frame extends JFrame{


    H3Panel jp4=new H3Panel("给你一缕春风，愿你拥有美丽前程；");
    JButton jb2=new JButton("下一页");
    public void init(){
        setBounds(300,300,500,250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(jp4);
        setTitle("To WYY:");
        jp4.add(jb2);
        jp4.setLayout(null);
        jb2.setBounds(370,150,90,30);
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

            }
        });
    }
}
class H3Panel extends JPanel{
    public H3Panel(String s){
        this.s=s;
    }
    String s;
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        ImageIcon img=new ImageIcon("src/bg.jpeg");
        g.drawImage(img.getImage(),0,0,this.getWidth(),this.getHeight(),this);
        g.setFont(new Font("楷体",Font.PLAIN,24));
        g.drawString(s,50,70);

    }
}
class H4Frame extends H3Frame{
    public H4Frame(String s){
        this.jp4=new H3Panel(s);
    }
    @Override
    public void init() {
        super.init();
        this.jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                H5Frame h5Frame=new H5Frame("给你一阵春雨，愿你永远年轻靓丽。");
                h5Frame.init();
            }
        });
    }
}
class H5Frame extends H3Frame{
    public H5Frame(String s){
        this.jp4=new H3Panel(s);
    }
    @Override
    public void init() {
        super.init();
        this.jp4=new H3Panel("给你一阵春雨，愿你永远年轻靓丽。");
        this.jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                H6Frame h6Frame=new H6Frame("真心祝你节日快乐(≧∀≦)ゞ");
                h6Frame.init();
            }
        });
    }
}
class H6Frame extends H3Frame{
    public H6Frame(String s){
        this.jp4=new H3Panel(s);
    }
    @Override
    public void init() {
        super.init();

        this.jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                H2Frame h2Frame=new H2Frame();
                h2Frame.init();
            }
        });
    }
}
