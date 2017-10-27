package kata.casinos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.lang.reflect.InvocationTargetException;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import kata.casinos.externals.CasinoDAO;
import kata.casinos.externals.ContextSession;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		JFrame mainFrame = new JFrame("Casino");
		
		CasinoTableModel model = new CasinoTableModel();
		JTable mainTable = new JTable(model);
		JScrollPane scroll =new JScrollPane(mainTable);
		JMenuItem menu = new JMenuItem(new AbstractAction("Login") {
			
			private static final long serialVersionUID = 1L;


			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel message = new JPanel();
				message.setLayout(new GridBagLayout());
				GridBagConstraints cs = new GridBagConstraints();
				cs.fill = GridBagConstraints.HORIZONTAL;
				cs.gridwidth = 1;
				cs.insets = new Insets(5, 5, 10, 10);
				
				JLabel userLabel = new JLabel("User");
				cs.gridx = 0;
				cs.gridy = 0;
				message.add(userLabel, cs);
				
				JTextField userText = new JTextField(20);
				cs.gridx = 1;
				cs.gridy = 0;
				message.add(userText, cs);
				
				JLabel passwordLabel = new JLabel("Password");
				cs.gridx = 0;
				cs.gridy = 1;
				message.add(passwordLabel, cs);
				
				JPasswordField passwordText = new JPasswordField(20);
				cs.gridx = 1;
				cs.gridy = 1;
				message.add(passwordText, cs);
				int res = JOptionPane.showConfirmDialog(mainFrame, message, "Login", JOptionPane.OK_CANCEL_OPTION);
				if (res == JOptionPane.OK_OPTION) {
					Casino loggedIn = CasinoDAO.findCasino(userText.getText(), new String(passwordText.getPassword()));
					ContextSession.getInstance().setLogged(loggedIn);
					model.fireTableDataChanged();
				}
			}
		});
		JMenuBar menuBar =  new JMenuBar();
		menuBar.add(menu);
		mainFrame.setJMenuBar(menuBar);
		JPanel searchPanel = new JPanel(new FlowLayout());
		JTextField searchField = new JTextField(20);
		searchPanel.add(searchField);
		JButton searchButton = new JButton(new AbstractAction("Search ?") {
			
			private static final long serialVersionUID = 4380719156887706509L;

			@Override
			public void actionPerformed(ActionEvent e) {
				model.setSearched(searchField.getText());
				model.fireTableDataChanged();
			}
		});
		searchPanel.add(searchButton);
		mainFrame.add(searchPanel, BorderLayout.NORTH);
		mainFrame.add(scroll, BorderLayout.CENTER);
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		SwingUtilities.invokeAndWait(() -> {
			mainFrame.pack();
			mainFrame.show();
		});
	}
	
	}
