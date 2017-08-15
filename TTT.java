package TicTacToe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TTT implements ActionListener {
      JFrame jf;
      JPanel jp;
      int a=0;
      JButton jb[][] = new JButton[3][3]; 
      ImageIcon x1 = new ImageIcon(this.getClass().getResource("O.png"));
      ImageIcon x2 = new ImageIcon(this.getClass().getResource("X.png"));
      String c1;
      int count1=0,count2=0;
      JMenuBar jm;    
      JMenu rt = new JMenu("Reset"); 
public TTT(){
    jm=new JMenuBar();
   
    jm.add(rt);
    
    
    jf=new JFrame("Tic-Tac-Toe Game");
    jp=new JPanel();
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(400,400);
     jf.setResizable(false);
    jf.setVisible(true);
    jp.setLayout(new GridLayout(3,3));
    jf.setJMenuBar(jm);
    jf.add(jp); 
    rt.addActionListener(this);
     for(int i=0;i<jb.length;i++)
     {
         for(int j=0;j<jb.length;j++)
         {
         jb[i][j]=new JButton();

         jp.add(jb[i][j]);
     }  
     }
    for(int i=0;i<jb.length;i++) 
    {
        for(int j=0;j<jb.length;j++){
        jb[i][j].addActionListener( this);
    }
 }
    
    
}
    
      @Override
      public void actionPerformed(ActionEvent e){
          for(int i=0;i<jb.length;i++){
              for(int j=0;j<jb.length;j++){
       if(e.getSource()==jb[i][j]){
           if(a==0){
            
           jb[i][j].setIcon(x1);
           a++;
           count1++;
       }
       else{
       
        jb[i][j].setIcon(x2);
      
       
           a--;
           count2++;
           } 
       //    jb[i][j].setEnabled(false);
           if(count1>2 || count2>2){
               
             
               if(jb[0][0].getIcon()==jb[1][1].getIcon() && jb[1][1].getIcon()== jb[2][2].getIcon() && jb[0][0].getIcon()==x1 || jb[0][2].getIcon()==jb[1][1].getIcon() && jb[1][1].getIcon()== jb[2][0].getIcon() && jb[1][1].getIcon()==x1)
	    {
	   JOptionPane.showMessageDialog(null,"  Player O wins  ","Result",JOptionPane.DEFAULT_OPTION);
	    }
    else if(jb[0][0].getIcon()==jb[1][1].getIcon() && jb[1][1].getIcon()== jb[2][2].getIcon() && jb[0][0].getIcon()==x2 || jb[0][2].getIcon()==jb[1][1].getIcon() && jb[1][1].getIcon()== jb[2][0].getIcon() && jb[1][1].getIcon()==x2 )
        {
    	JOptionPane.showMessageDialog(null,"  Player X wins  ","Result",JOptionPane.DEFAULT_OPTION);
        } 
    else if(jb[0][0].getIcon()==jb[0][1].getIcon() && jb[0][1].getIcon()== jb[0][2].getIcon() && jb[0][0].getIcon()==x2 || jb[1][0].getIcon()==jb[1][1].getIcon() && jb[1][1].getIcon()== jb[1][2].getIcon() && jb[1][1].getIcon()==x2 || jb[2][0].getIcon()==jb[2][1].getIcon() && jb[2][1].getIcon()== jb[2][2].getIcon() && jb[2][2].getIcon()==x2)
    {    
               
          JOptionPane.showMessageDialog(null,"  Player X wins  ","Result",JOptionPane.DEFAULT_OPTION);     
               
    }
    else if(jb[0][0].getIcon()==jb[0][1].getIcon() && jb[0][1].getIcon()== jb[0][2].getIcon() && jb[0][0].getIcon()==x1 || jb[1][0].getIcon()==jb[1][1].getIcon() && jb[1][1].getIcon()== jb[1][2].getIcon() && jb[1][1].getIcon()==x2 || jb[2][0].getIcon()==jb[2][1].getIcon() && jb[2][1].getIcon()== jb[2][2].getIcon() && jb[2][2].getIcon()==x1)
            {
       
               JOptionPane.showMessageDialog(null,"  Player O wins  ","Result",JOptionPane.DEFAULT_OPTION); 
    } 
               else if(jb[0][0].getIcon()==jb[1][0].getIcon() && jb[1][0].getIcon()== jb[2][0].getIcon() && jb[0][0].getIcon()==x1 || jb[0][1].getIcon()==jb[1][1].getIcon() && jb[1][1].getIcon()== jb[2][1].getIcon() && jb[1][1].getIcon()==x1 || jb[0][2].getIcon()==jb[1][2].getIcon() && jb[1][2].getIcon()== jb[2][2].getIcon() && jb[2][2].getIcon()==x1)
            {
       
               JOptionPane.showMessageDialog(null,"  Player O wins  ","Result",JOptionPane.DEFAULT_OPTION); 
            }           
               
             else if(jb[0][0].getIcon()==jb[1][0].getIcon() && jb[1][0].getIcon()== jb[2][0].getIcon() && jb[0][0].getIcon()==x2 || jb[0][1].getIcon()==jb[1][1].getIcon() && jb[1][1].getIcon()== jb[2][1].getIcon() && jb[1][1].getIcon()==x2 || jb[0][2].getIcon()==jb[1][2].getIcon() && jb[1][2].getIcon()== jb[2][2].getIcon() && jb[2][2].getIcon()==x2)
             {
               JOptionPane.showMessageDialog(null,"  Player X wins  ","Result",JOptionPane.DEFAULT_OPTION); 
             }
             else if(count1 ==5 && count2==4 ){
                 JOptionPane.showMessageDialog(null,"  Match Draw ","Result",JOptionPane.DEFAULT_OPTION);
             } 
           }
      }  
      }
      }
        if(e.getSource()==rt)
        { 
        
        for(int i=0;i<3;i++)
          {
              for(int j=0;j<3;j++)
              {
                  jb[i][j].setIcon(null);
              }  
          } 
        }
    }
          
    public static void main(String[] args) {
         new TTT();
    }
}
