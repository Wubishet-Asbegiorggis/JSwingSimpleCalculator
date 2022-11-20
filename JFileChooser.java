package smJv;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class JFileChooser0 extends JFrame implements ActionListener{
	JMenuBar mnbr0;
	JMenu file;
	JMenuItem open;;
	JTextArea txtarea0;
	public JFileChooser0()
	{
		mnbr0=new JMenuBar();
		file=new JMenu("File");
		open=new JMenuItem("Open");
		txtarea0=new JTextArea();
		mnbr0.setBounds(40,50,1000,30);
		txtarea0.setBounds(60,90,1000,550);
		add(mnbr0);
		add(txtarea0);
		mnbr0.add(file);
		file.add(open);
		open.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ev)
	{
		if(ev.getSource()==open)
		{
			JFileChooser flchsr0=new JFileChooser();
			int i=flchsr0.showOpenDialog(this);
			if(i==JFileChooser.APPROVE_OPTION)
			{
				File file0=flchsr0.getSelectedFile();
				String path=file0.getPath();
				try
				{
					FileReader flrdr0=new FileReader(path);
					BufferedReader bfrdr0=new BufferedReader(flrdr0);
					String file1="",file2="";
					while((file1=bfrdr0.readLine())!=null)
					{
						file2+=file1+"\n";
					}
					txtarea0.setText(file2);
					bfrdr0.close();
				}
				catch(Exception exc)
				{
					System.out.println("\n   Exception : "+exc.getMessage());
				}
			}
		}
	}
	public static void main(String[] args) {
		JFileChooser0 Obj=new JFileChooser0();
		Obj.setSize(500,500);
		Obj.setLayout(null);
		Obj.setVisible(true);
	}
}
