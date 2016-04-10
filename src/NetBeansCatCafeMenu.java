import java.awt.event.ActionEvent;	
import java.awt.event.ActionListener;			
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;	
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.event.ChangeEvent;			
import javax.swing.event.ChangeListener;			
import javax.swing.text.JTextComponent;

public class NetBeansCatCafeMenu extends javax.swing.JFrame {
	
	JFrame frame;
	
	public static LoginGUI LG;
	public static LogoutWindow logout;
	public static NetBeansCatCafeMenu menu;

	
	public void setLogout(LogoutWindow p2) {
		logout = p2;
		menu = this;
	}

    	/**
    	 * Creates new form NetBeansCatCafeMenu
    	 */
   
        public ArrayList<JSpinner> js = new ArrayList<JSpinner>();
        SpinnerListener spinnerCL;
    
    	//input DRINKS LISTS & METHODS
        ArrayList<Double> DrinkPrices = new ArrayList<Double>();
        ArrayList<String> DrinkNames = new ArrayList<String>();
	
        public String getDrinkNames(int idx){
        	String DrinkName = DrinkNames.get(idx);
        	return DrinkName;
        }
        
        public Double getDrinkPrices(int idx){
        	Double DrinkPrice = DrinkPrices.get(idx);
        	return DrinkPrice;
        }
	
        //input SALADS LISTS & METHODS
        ArrayList<String> SaladsNames = new ArrayList<String>();
        ArrayList<Double> SaladsPrices = new ArrayList<Double>();
	
        public String getSaladsNames(int idx){
        	String SaladsName = SaladsNames.get(idx);
        	return SaladsName;
        }
        
        public Double getSaladsPrices(int idx){
        	Double SaladsPrice = SaladsPrices.get(idx); 
        	return SaladsPrice;
        }
	
        //input SANDWICHES LISTS & METHODS
        ArrayList<String> SandwichesNames = new ArrayList<String>();
        ArrayList<Double> SandwichesPrices = new ArrayList<Double>();
        public String getSandwichesNames(int idx){
        	String SandwichesName = SandwichesNames.get(idx);
        	return SandwichesName;
        }
	
        public Double getSandwichesPrices(int idx){
        	Double SandwichesPrice = SandwichesPrices.get(idx);
        	return SandwichesPrice;
        }
	
        //input BAKED GOODS LISTS & METHODS
        ArrayList<String> BakedGoodsNames = new ArrayList<String>();
        ArrayList<Double> BakedGoodsPrices = new ArrayList<Double>();
        public String getBakedGoodsNames(int idx){
        	String BakedGoodsName = BakedGoodsNames.get(idx);
        	return BakedGoodsName;
        }
	
        public Double getBakedGoodsPrices(int idx){
        	Double BakedGoodsPrice = BakedGoodsPrices.get(idx);
        	return BakedGoodsPrice;
        }
	
        //input CAT FOOD LISTS & METHODS
        ArrayList<Double> CatFoodPrices = new ArrayList<Double>();
        ArrayList<String> CatFoodNames = new ArrayList<String>();
		
        public String getCatFoodNames(int idx){
        	String CatFoodName = CatFoodNames.get(idx);
        	return CatFoodName;
        }
	
        public Double getCatFoodPrices(int idx){
        	Double CatFoodPrice = CatFoodPrices.get(idx);
        	return CatFoodPrice;
        }
        
        
        public NetBeansCatCafeMenu() {
        	//input image stuff here
        	spinnerCL = new SpinnerListener(this);	

        	initComponents();   //creates textfields
        
        		//populate arraylists with all the textfield
                 //call a method "initValuesComponents" --> already be created, use the menu class to populate
  
          //populate DRINKS lists & textfields
        DrinkNames.add("Coffee");
        DrinkNames.add("Cappuccino");
        DrinkNames.add("Mocha");
        DrinkNames.add("Latte");
        DrinkNames.add("Black Tea");
		DrinkNames.add("Green Tea");
		DrinkNames.add("Orange Juice"); 
		DrinkNames.add("Water");
		DrinkPrices.add(1.99);
		DrinkPrices.add(3.99);
		DrinkPrices.add(3.99);
		DrinkPrices.add(3.99);
		DrinkPrices.add(1.99);
		DrinkPrices.add(1.99);
		DrinkPrices.add(2.99);
		DrinkPrices.add(1.99); 
		
		jTextField1.setText(getDrinkNames(0));
		jTextField2.setText(getDrinkNames(1));
		jTextField3.setText(getDrinkNames(2));
		jTextField4.setText(getDrinkNames(3));
		jTextField5.setText(getDrinkNames(4));
		jTextField6.setText(getDrinkNames(5));
		jTextField7.setText(getDrinkNames(6));
		jTextField8.setText(getDrinkNames(7));
	    
		String dPrice1 = String.valueOf(getDrinkPrices(0));
        String dPrice2 = String.valueOf(getDrinkPrices(1));
        String dPrice3 = String.valueOf(getDrinkPrices(2));
        String dPrice4 = String.valueOf(getDrinkPrices(3));
        String dPrice5 = String.valueOf(getDrinkPrices(4));
        String dPrice6 = String.valueOf(getDrinkPrices(5));
        String dPrice7 = String.valueOf(getDrinkPrices(6));
        String dPrice8 = String.valueOf(getDrinkPrices(7));
        jTextField25.setText(dPrice1);
        jTextField26.setText(dPrice2);
        jTextField27.setText(dPrice3);
        jTextField28.setText(dPrice4);
        jTextField29.setText(dPrice5);
        jTextField30.setText(dPrice6);
        jTextField31.setText(dPrice7);
        jTextField32.setText(dPrice8);

  
        //populate SALADS lists & textfields
        SaladsNames.add("House Salad");
    	SaladsNames.add("Caesar Salad");
    	SaladsNames.add("Greek Salad");
		SaladsPrices.add(5.99);
		SaladsPrices.add(5.99);
		SaladsPrices.add(6.99);
		
        jTextField9.setText(getSaladsNames(0));
        jTextField10.setText(getSaladsNames(1));
        jTextField11.setText(getSaladsNames(2));
        
        String sPrice1 = String.valueOf(getSaladsPrices(0));
        String sPrice2 = String.valueOf(getSaladsPrices(1));
        String sPrice3 = String.valueOf(getSaladsPrices(2));
        jTextField33.setText(sPrice1);
        jTextField34.setText(sPrice2);
        jTextField35.setText(sPrice3);
        
        //populate SANDWICHES lists & textfields
    	SandwichesNames.add("Turkey and Cheese Panini");
    	SandwichesNames.add("Veggie Panini");
    	SandwichesNames.add("Italian Panini");
    	SandwichesNames.add("Grilled Cheese");	
    	SandwichesPrices.add(7.99);
    	SandwichesPrices.add(5.99);
    	SandwichesPrices.add(7.99);
    	SandwichesPrices.add(3.99);
    	
    	jTextField12.setText(getSandwichesNames(0));
        jTextField13.setText(getSandwichesNames(1));
        jTextField14.setText(getSandwichesNames(2));
        jTextField15.setText(getSandwichesNames(3));
        
        String swPrice1 = String.valueOf(getSandwichesPrices(0));
        String swPrice2 = String.valueOf(getSandwichesPrices(1));
        String swPrice3 = String.valueOf(getSandwichesPrices(2));
        String swPrice4 = String.valueOf(getSandwichesPrices(3));
        jTextField36.setText(swPrice1);
        jTextField37.setText(swPrice2);
        jTextField38.setText(swPrice3);
        jTextField39.setText(swPrice4);
        
        //populate BAKED GOODS lists & textfields
    	BakedGoodsNames.add("Crossiant");
    	BakedGoodsNames.add("Blueberry Muffin");
    	BakedGoodsNames.add("Cranberry Scone");
    	BakedGoodsNames.add("Apple Turnover");
    	BakedGoodsNames.add("Chocolate Crossiant");
    	BakedGoodsNames.add("Pumpkin Bread");
    	BakedGoodsNames.add("Coffee Cake");
    	BakedGoodsPrices.add(0.99);
    	BakedGoodsPrices.add(1.99);
    	BakedGoodsPrices.add(1.99);
    	BakedGoodsPrices.add(2.99);
    	BakedGoodsPrices.add(0.99);
    	BakedGoodsPrices.add(2.99);
    	BakedGoodsPrices.add(3.99);
    	
    	jTextField16.setText(getBakedGoodsNames(0));
		jTextField17.setText(getBakedGoodsNames(1));
		jTextField18.setText(getBakedGoodsNames(2));
		jTextField19.setText(getBakedGoodsNames(3));
		jTextField20.setText(getBakedGoodsNames(4));
		jTextField21.setText(getBakedGoodsNames(5));
		jTextField22.setText(getBakedGoodsNames(6));
	    
		String bgPrice1 = String.valueOf(getBakedGoodsPrices(0));
        String bgPrice2 = String.valueOf(getBakedGoodsPrices(1));
        String bgPrice3 = String.valueOf(getBakedGoodsPrices(2));
        String bgPrice4 = String.valueOf(getBakedGoodsPrices(3));
        String bgPrice5 = String.valueOf(getBakedGoodsPrices(4));
        String bgPrice6 = String.valueOf(getBakedGoodsPrices(5));
        String bgPrice7 = String.valueOf(getBakedGoodsPrices(6));
        jTextField40.setText(bgPrice1);
        jTextField41.setText(bgPrice2);
        jTextField42.setText(bgPrice3);
        jTextField43.setText(bgPrice4);
        jTextField44.setText(bgPrice5);
        jTextField45.setText(bgPrice6);
        jTextField46.setText(bgPrice7);
        
        //populate CAT FOOD lists & textfields
        CatFoodNames.add("Salmon Flavor");
		CatFoodNames.add("Chicken Flavor");	
		CatFoodPrices.add(1.99);
		CatFoodPrices.add(1.99);
			
		jTextField23.setText(getCatFoodNames(0));
        jTextField24.setText(getCatFoodNames(1));
        
        String cfPrice1 = String.valueOf(getCatFoodPrices(0));
        String cfPrice2 = String.valueOf(getCatFoodPrices(1));
        jTextField47.setText(cfPrice1);
        jTextField48.setText(cfPrice2);

        jTextField50.setText("               ");
        
        js.add(jSpinner1);
        js.add(jSpinner2);
        js.add(jSpinner3);
        js.add(jSpinner4);
        js.add(jSpinner5);
        js.add(jSpinner6);
        js.add(jSpinner7);
        js.add(jSpinner8);
        js.add(jSpinner9);
        js.add(jSpinner10);
        js.add(jSpinner11);
        js.add(jSpinner12);
        js.add(jSpinner13);
        js.add(jSpinner14);
        js.add(jSpinner15);
        js.add(jSpinner16);
        js.add(jSpinner17);
        js.add(jSpinner18);
        js.add(jSpinner19);
        js.add(jSpinner20);
        js.add(jSpinner21);
        js.add(jSpinner22);
        js.add(jSpinner23);
        js.add(jSpinner24);
    
    
    jButton6.addActionListener(new ActionListener() {  
	public void actionPerformed(ActionEvent e) {
	
		jButton6.setText("DELETE ORDER");	
	}
   });	
    
    jButton6.addActionListener(new ActionListener() {  //delete order
	public void actionPerformed(ActionEvent f) {
	
		int selection = JOptionPane.showConfirmDialog( //dialog box popup
                null
        , "Are you sure you want to delete your order?"
        , ""
        , JOptionPane.OK_CANCEL_OPTION
        , JOptionPane.INFORMATION_MESSAGE);


		if (selection == JOptionPane.OK_OPTION) {
	
			jSpinner1.setValue(0); 
			jSpinner2.setValue(0);
			jSpinner3.setValue(0);
			jSpinner4.setValue(0);
			jSpinner5.setValue(0);
			jSpinner6.setValue(0);
			jSpinner7.setValue(0);
			jSpinner8.setValue(0);
			jSpinner9.setValue(0);
			jSpinner10.setValue(0);
			jSpinner11.setValue(0);
			jSpinner12.setValue(0);
			jSpinner13.setValue(0);
			jSpinner14.setValue(0);
			jSpinner15.setValue(0);
			jSpinner16.setValue(0);
			jSpinner17.setValue(0);
			jSpinner18.setValue(0);
			jSpinner19.setValue(0);
			jSpinner20.setValue(0);
			jSpinner21.setValue(0);
			jSpinner22.setValue(0);
			jSpinner23.setValue(0);
			jSpinner24.setValue(0);
			
			AdoptCount = 0;			
			jTextArea1.setText(" ");
			jTextField50.setText("               ");

		}
		
		else if (selection == JOptionPane.CANCEL_OPTION) {
		}
		}
	});
       
    
    jButton4.addActionListener(new ActionListener() { //search order
    	public void actionPerformed(ActionEvent f) {
    	
    	jTextArea1.setText("");
   
	    	if((jTextField49.getText()).equals("1")) {
	    	
		    	jTextArea1.setText(" Order #1 - 01/05/15 \n 2 Water $3.98 \n 1 Blueberry Muffin $1.99"
		    	+ "\n 1 Veggie Panini $5.99 \n 2 Cat Food: Salmon Flavor $3.98");	
	    	}
	    	
	    	if((jTextField49.getText()).equals("2")) {
	    	
		    	jTextArea1.setText(" Order #2 - 02/12/15 \n 1 Green Tea $2.50 \n "
		    	+ "1 Caeasar Salad $5.99 \n 1 Cat Food: Chicken Flavor $1.99");
	    	}
	    	
	    	if((jTextField49.getText()).equals("3")) {
	    	
		    	jTextArea1.setText(" Order #3 - 03/14/15 \n 1 Capuccino $3.50 \n 1 House Salad $5.99 \n"
		    	+ " 1 Italian Panini $7.99 \n 3 Cat Food: Chicken Flavor $5.97");	
	    	}
	    	
	    	if((jTextField49.getText()).equals("4")){
	    	
		    	jTextArea1.setText(" Order #4 - 03/28-15 \n 2 Orange Juice $5.98 \n "
		    	+ "1 Grilled Cheese $3.99 \n 1 Cat Food: Salmon Flavor $1.99");	
	    	}
	    	
	    	if((jTextField49.getText()).equals("5")) {
	    	
		    	jTextArea1.setText(" Order #5 - 04/19/15 \n 1 Latte $3.50 \n 2 Pumpkin Bread $5.98 \n"
		    	+ " 1 Turkey and Cheese Panini $7.99 \n 1 Apple Turnover $2.99 \n"
		    	+ " 2 Cat Food: Salmon Flavor $3.98");	
	    	}
	    	
	    	if(!(jTextField49.getText()).equals("1") && !(jTextField49.getText()).equals("2") &&
	    	!(jTextField49.getText()).equals("3") && ! (jTextField49.getText()).equals("4") &&
	    	!(jTextField49.getText()).equals("5")) {
	    		
	    		jTextArea1.setText("INVALID ORDER NUMBER");
	    	}
    	}
    });
    
    jButton5.addActionListener(new ActionListener() { 
    	public void actionPerformed(ActionEvent e){
    		
	    	jTextArea1.setText(" Order #1 - 01/05/15 \n 2 Water $3.98 \n 1 Blueberry Muffin $1.99"
	    	+ "\n 1 Veggie Panini $5.99 \n 2 Cat Food: Salmon Flavor $3.98 \n \n"
	    	+ " Order #2 - 02/12/15 \n 1 Green Tea $2.50 \n 1 Caeasar Salad $5.99"
	    	+ " \n 1 Cat Food: Chicken Flavor $1.99 \n \n"
	    	+ " Order #3 - 03/14/15 \n 1 Capuccino $3.50 \n 1 House Salad $5.99 \n"
	    	+ " 1 Italian Panini $7.99 \n 3 Cat Food: Chicken Flavor $5.97 \n \n"
	    	+ " Order #4 - 03/28-15 \n 2 Orange Juice $5.98 \n 1 Grilled Cheese $3.99"
	    	+ "\n 1 Cat Food: Salmon Flavor $1.99 \n \n"
	    	+ " Order #5 - 04/19/15 \n 1 Latte $3.50 \n 2 Pumpkin Bread $5.98 \n"
	    	+ " 1 Turkey and Cheese Panini $7.99 \n 1 Apple Turnover $2.99 \n"
	    	+ " 2 Cat Food: Salmon Flavor $3.98");
	    	
	    	
	    	System.out.println("Order #5");
	    	System.out.println("04/19/15");
	    	System.out.println("Latte - $3.50");
	    	System.out.println("Pumpkin Bread - $2.99");
	    	System.out.println("Turkey and Cheese Panini - $7.99");
	    	System.out.println("Apple Turnover - $2.99");
	    	System.out.println("Cat Food: Salmon Flavor - $1.99");
    	}
    });
   }
   
        public NetBeansCatCafeMenu(LoginGUI lG) {
    }

        /**
        * This method is called from within the constructor to initialize the form.
        * WARNING: Do NOT modify this code. The content of this method is always
        * regenerated by the Form Editor.
        */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    
        	private void initComponents() {

		        jScrollPane2 = new javax.swing.JScrollPane();
		        jTextArea2 = new javax.swing.JTextArea();
		        jPanel1 = new javax.swing.JPanel();
		        jLabel4 = new javax.swing.JLabel();
		        jPanel10 = new javax.swing.JPanel();
		        jScrollPane3 = new javax.swing.JScrollPane();
		        jTextArea3 = new javax.swing.JTextArea();
		        jPanel12 = new javax.swing.JPanel();
		        jScrollPane5 = new javax.swing.JScrollPane();
		        jTextArea5 = new javax.swing.JTextArea();
		        jButton1 = new javax.swing.JButton();
		        jLabel6 = new javax.swing.JLabel();
		        jLabel7 = new javax.swing.JLabel();
		        jButton3 = new javax.swing.JButton();
		        jButton2 = new javax.swing.JButton();
		        jLabel2 = new javax.swing.JLabel();
		        jPanel13 = new javax.swing.JPanel();
		        jScrollPane6 = new javax.swing.JScrollPane();
		        jTextArea6 = new javax.swing.JTextArea();
		        jLabel64 = new javax.swing.JLabel();
		        jPanel2 = new javax.swing.JPanel();
		        jLabel9 = new javax.swing.JLabel();
		        jSpinner1 = new javax.swing.JSpinner();
		        jSpinner2 = new javax.swing.JSpinner();
		        jSpinner3 = new javax.swing.JSpinner();
		        jSpinner4 = new javax.swing.JSpinner();
		        jSpinner5 = new javax.swing.JSpinner();
		        jSpinner6 = new javax.swing.JSpinner();
		        jSpinner7 = new javax.swing.JSpinner();
		        jSpinner8 = new javax.swing.JSpinner();
		        jTextField1 = new javax.swing.JTextField();
		        jTextField2 = new javax.swing.JTextField();
		        jTextField3 = new javax.swing.JTextField();
		        jTextField4 = new javax.swing.JTextField();
		        jTextField5 = new javax.swing.JTextField();
		        jTextField6 = new javax.swing.JTextField();
		        jTextField7 = new javax.swing.JTextField();
		        jTextField8 = new javax.swing.JTextField();
		        jTextField25 = new javax.swing.JTextField();
		        jTextField26 = new javax.swing.JTextField();
		        jTextField27 = new javax.swing.JTextField();
		        jTextField28 = new javax.swing.JTextField();
		        jTextField29 = new javax.swing.JTextField();
		        jTextField30 = new javax.swing.JTextField();
		        jTextField31 = new javax.swing.JTextField();
		        jTextField32 = new javax.swing.JTextField();
		        jLabel21 = new javax.swing.JLabel();
		        jLabel22 = new javax.swing.JLabel();
		        jLabel23 = new javax.swing.JLabel();
		        jLabel24 = new javax.swing.JLabel();
		        jLabel25 = new javax.swing.JLabel();
		        jLabel26 = new javax.swing.JLabel();
		        jLabel27 = new javax.swing.JLabel();
		        jLabel28 = new javax.swing.JLabel();
		        jLabel3 = new javax.swing.JLabel();
		        jLabel5 = new javax.swing.JLabel();
		        jLabel8 = new javax.swing.JLabel();
		        jLabel12 = new javax.swing.JLabel();
		        jLabel17 = new javax.swing.JLabel();
		        jLabel18 = new javax.swing.JLabel();
		        jLabel19 = new javax.swing.JLabel();
		        jLabel20 = new javax.swing.JLabel();
		        jPanel3 = new javax.swing.JPanel();
		        jLabel10 = new javax.swing.JLabel();
		        jSpinner9 = new javax.swing.JSpinner();
		        jSpinner10 = new javax.swing.JSpinner();
		        jSpinner11 = new javax.swing.JSpinner();
		        jTextField9 = new javax.swing.JTextField();
		        jTextField10 = new javax.swing.JTextField();
		        jTextField11 = new javax.swing.JTextField();
		        jTextField33 = new javax.swing.JTextField();
		        jTextField34 = new javax.swing.JTextField();
		        jTextField35 = new javax.swing.JTextField();
		        jLabel29 = new javax.swing.JLabel();
		        jLabel30 = new javax.swing.JLabel();
		        jLabel31 = new javax.swing.JLabel();
		        jLabel45 = new javax.swing.JLabel();
		        jLabel46 = new javax.swing.JLabel();
		        jLabel47 = new javax.swing.JLabel();
		        jPanel4 = new javax.swing.JPanel();
		        jLabel11 = new javax.swing.JLabel();
		        jSpinner16 = new javax.swing.JSpinner();
		        jSpinner17 = new javax.swing.JSpinner();
		        jSpinner18 = new javax.swing.JSpinner();
		        jSpinner19 = new javax.swing.JSpinner();
		        jSpinner20 = new javax.swing.JSpinner();
		        jSpinner21 = new javax.swing.JSpinner();
		        jSpinner22 = new javax.swing.JSpinner();
		        jTextField16 = new javax.swing.JTextField();
		        jTextField17 = new javax.swing.JTextField();
		        jTextField18 = new javax.swing.JTextField();
		        jTextField19 = new javax.swing.JTextField();
		        jTextField20 = new javax.swing.JTextField();
		        jTextField21 = new javax.swing.JTextField();
		        jTextField22 = new javax.swing.JTextField();
		        jTextField40 = new javax.swing.JTextField();
		        jTextField41 = new javax.swing.JTextField();
		        jTextField42 = new javax.swing.JTextField();
		        jTextField43 = new javax.swing.JTextField();
		        jTextField44 = new javax.swing.JTextField();
		        jTextField45 = new javax.swing.JTextField();
		        jTextField46 = new javax.swing.JTextField();
		        jLabel36 = new javax.swing.JLabel();
		        jLabel37 = new javax.swing.JLabel();
		        jLabel38 = new javax.swing.JLabel();
		        jLabel39 = new javax.swing.JLabel();
		        jLabel40 = new javax.swing.JLabel();
		        jLabel41 = new javax.swing.JLabel();
		        jLabel42 = new javax.swing.JLabel();
		        jLabel52 = new javax.swing.JLabel();
		        jLabel53 = new javax.swing.JLabel();
		        jLabel54 = new javax.swing.JLabel();
		        jLabel55 = new javax.swing.JLabel();
		        jLabel56 = new javax.swing.JLabel();
		        jLabel57 = new javax.swing.JLabel();
		        jLabel58 = new javax.swing.JLabel();
		        jPanel6 = new javax.swing.JPanel();
		        jLabel13 = new javax.swing.JLabel();
		        jSpinner12 = new javax.swing.JSpinner();
		        jSpinner13 = new javax.swing.JSpinner();
		        jSpinner14 = new javax.swing.JSpinner();
		        jSpinner15 = new javax.swing.JSpinner();
		        jTextField12 = new javax.swing.JTextField();
		        jTextField13 = new javax.swing.JTextField();
		        jTextField14 = new javax.swing.JTextField();
		        jTextField15 = new javax.swing.JTextField();
		        jTextField36 = new javax.swing.JTextField();
		        jTextField37 = new javax.swing.JTextField();
		        jTextField38 = new javax.swing.JTextField();
		        jTextField39 = new javax.swing.JTextField();
		        jLabel32 = new javax.swing.JLabel();
		        jLabel33 = new javax.swing.JLabel();
		        jLabel34 = new javax.swing.JLabel();
		        jLabel35 = new javax.swing.JLabel();
		        jLabel48 = new javax.swing.JLabel();
		        jLabel49 = new javax.swing.JLabel();
		        jLabel50 = new javax.swing.JLabel();
		        jLabel51 = new javax.swing.JLabel();
		        jPanel7 = new javax.swing.JPanel();
		        jLabel14 = new javax.swing.JLabel();
		        jSpinner23 = new javax.swing.JSpinner();
		        jTextField23 = new javax.swing.JTextField();
		        jTextField24 = new javax.swing.JTextField();
		        jSpinner24 = new javax.swing.JSpinner();
		        jTextField47 = new javax.swing.JTextField();
		        jTextField48 = new javax.swing.JTextField();
		        jLabel43 = new javax.swing.JLabel();
		        jLabel44 = new javax.swing.JLabel();
		        jLabel59 = new javax.swing.JLabel();
		        jLabel60 = new javax.swing.JLabel();
		        jPanel8 = new javax.swing.JPanel();
		        jLabel15 = new javax.swing.JLabel();
		        jScrollPane1 = new javax.swing.JScrollPane();
		        jTextArea1 = new javax.swing.JTextArea();
		        jLabel61 = new javax.swing.JLabel();
		        jTextField49 = new javax.swing.JTextField();
		        jButton4 = new javax.swing.JButton();
		        jButton5 = new javax.swing.JButton();
		        jPanel9 = new javax.swing.JPanel();
		        jLabel16 = new javax.swing.JLabel();
		        jLabel62 = new javax.swing.JLabel();
		        jLabel63 = new javax.swing.JLabel();
		        setjTextField50(new javax.swing.JTextField());
		        jButton6 = new javax.swing.JButton();
		        jButton7 = new javax.swing.JButton();
		        jLabel1 = new javax.swing.JLabel();
		
		        jTextArea2.setColumns(20);
		        jTextArea2.setRows(5);
		        jScrollPane2.setViewportView(jTextArea2);
		
		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		        setBackground(new java.awt.Color(204, 204, 204));
		        setResizable(false);
		
		        jPanel1.setBackground(new java.awt.Color(232, 232, 232));
		        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
		
		        jLabel4.setIcon(new javax.swing.ImageIcon("cat2 itty bitty.jpg")); // NOI18N
		        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
		
		        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
		
		        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
		
		        jTextArea3.setEditable(false);
		        jTextArea3.setBackground(new java.awt.Color(240, 240, 240));
		        jTextArea3.setColumns(20);
		        jTextArea3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
		        jTextArea3.setLineWrap(true);
		        jTextArea3.setRows(5);
		        jTextArea3.setText("Name: Jon Snow\nBio: \"Knows Nothing\"\nHe is a very loyal & loving cat, & very protective of his shelter brothers & sisters.");
		        jTextArea3.setBorder(null);
		        jScrollPane3.setViewportView(jTextArea3);
		
		        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		        jPanel10.setLayout(jPanel10Layout);
		        jPanel10Layout.setHorizontalGroup(
		            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel10Layout.createSequentialGroup()
		                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(0, 0, Short.MAX_VALUE))
		        );
		        jPanel10Layout.setVerticalGroup(
		            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
		        );
		
		        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
		
		        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
		
		        jTextArea5.setEditable(false);
		        jTextArea5.setBackground(new java.awt.Color(240, 240, 240));
		        jTextArea5.setColumns(20);
		        jTextArea5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
		        jTextArea5.setLineWrap(true);
		        jTextArea5.setRows(5);
		        jTextArea5.setText("Name: Lannister\nBio: \"Always pays hisdebts\"\nThis cat thinks he's the most important cat in the room, but he's also the most loyal to his adoptive family.");
		        jTextArea5.setBorder(null);
		        jScrollPane5.setViewportView(jTextArea5);
		
		        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
		        jPanel12.setLayout(jPanel12Layout);
		        jPanel12Layout.setHorizontalGroup(
		            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel12Layout.createSequentialGroup()
		                .addGap(0, 0, 0)
		                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
		                .addGap(0, 0, 0))
		        );
		        jPanel12Layout.setVerticalGroup(
		            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
		        );
		
		        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		        jButton1.setForeground(new java.awt.Color(51, 51, 51));
		        jButton1.setText("ADOPT");
		        jButton1.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton1ActionPerformed(evt);
		            }
		        });
		
		        jLabel6.setIcon(new javax.swing.ImageIcon("cat3 itty bitty.jpg")); // NOI18N
		        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
		
		        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
		        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
		        jLabel7.setText("SHELTER CATS");
		
		        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		        jButton3.setForeground(new java.awt.Color(51, 51, 51));
		        jButton3.setText("ADOPT");
		        jButton3.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton3ActionPerformed(evt);
		            }
		        });
		
		        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		        jButton2.setForeground(new java.awt.Color(51, 51, 51));
		        jButton2.setText("ADOPT");
		        jButton2.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton2ActionPerformed(evt);
		            }
		        });
		
		        jLabel2.setIcon(new javax.swing.ImageIcon("cat1 itty bitty.jpg")); // NOI18N
		        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
		
		        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
		
		        jTextArea6.setEditable(false);
		        jTextArea6.setBackground(new java.awt.Color(240, 240, 240));
		        jTextArea6.setColumns(20);
		        jTextArea6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
		        jTextArea6.setLineWrap(true);
		        jTextArea6.setRows(5);
		        jTextArea6.setText("Name: Daenarys\nBio: \"Mother of Dragons\"\nShe is very friendly but if you mess with her 3 toy dragon \"babies\", watchout...");
		        jScrollPane6.setViewportView(jTextArea6);
		
		        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
		        jPanel13.setLayout(jPanel13Layout);
		        jPanel13Layout.setHorizontalGroup(
		            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
		                .addGap(0, 0, 0)
		                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
		                .addGap(0, 0, 0))
		        );
		        jPanel13Layout.setVerticalGroup(
		            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
		        );
		
		        jLabel64.setText("(Adoption Fee is $67 --- This covers vaccines, fixing, tests, & more!)");
		
		        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		        jPanel1.setLayout(jPanel1Layout);
		        jPanel1Layout.setHorizontalGroup(
		            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel1Layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(jPanel1Layout.createSequentialGroup()
		                        .addComponent(jLabel2)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jButton1)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                        .addComponent(jLabel4)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jButton2)
		                        .addGap(34, 34, 34)
		                        .addComponent(jLabel6)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jButton3)
		                        .addGap(6, 6, 6))
		                    .addGroup(jPanel1Layout.createSequentialGroup()
		                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(4, 4, 4)
		                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(jPanel1Layout.createSequentialGroup()
		                        .addComponent(jLabel7)
		                        .addGap(59, 59, 59)
		                        .addComponent(jLabel64)
		                        .addGap(0, 0, Short.MAX_VALUE)))
		                .addContainerGap())
		        );
		        jPanel1Layout.setVerticalGroup(
		            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel1Layout.createSequentialGroup()
		                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(jPanel1Layout.createSequentialGroup()
		                        .addGap(2, 2, 2)
		                        .addComponent(jLabel7))
		                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
		                        .addContainerGap()
		                        .addComponent(jLabel64)))
		                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
		                        .addGap(49, 49, 49)
		                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(42, 42, 42))
		                    .addGroup(jPanel1Layout.createSequentialGroup()
		                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(jPanel1Layout.createSequentialGroup()
		                                .addGap(2, 2, 2)
		                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addComponent(jLabel4)
		                                    .addGroup(jPanel1Layout.createSequentialGroup()
		                                        .addGap(46, 46, 46)
		                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                    .addComponent(jLabel6)))
		                            .addGroup(jPanel1Layout.createSequentialGroup()
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
		                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addGap(39, 39, 39))
		                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
		                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		                .addGap(5, 5, 5))
		        );
		
		        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
		        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
		
		        jLabel9.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
		        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
		        jLabel9.setText("DRINKS");
		
		        jButton1.addChangeListener(spinnerCL);
		        jButton2.addChangeListener(spinnerCL);
		        jButton3.addChangeListener(spinnerCL);
		        
		        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
		        jSpinner1.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinner1, ""));
		        jSpinner1.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner1.getEditor()).getTextField().setEditable(false);
		
		        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner2.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner2.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner3.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner3.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner4.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner4.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner5.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner5.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner6.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner6.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner7.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner7.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner8.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner8.getEditor()).getTextField().setEditable(false);
		        
		        jTextField1.setEditable(false);
		        jTextField1.setText("jTextField1");
		        jTextField1.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jTextField1ActionPerformed(evt);
		            }
		        });
		
		        jTextField2.setEditable(false);
		        jTextField2.setText("jTextField2");
		
		        jTextField3.setEditable(false);
		        jTextField3.setText("jTextField3");
		
		        jTextField4.setEditable(false);
		        jTextField4.setText("jTextField4");
		
		        jTextField5.setEditable(false);
		        jTextField5.setText("jTextField5");
		
		        jTextField6.setEditable(false);
		        jTextField6.setText("jTextField6");
		
		        jTextField7.setEditable(false);
		        jTextField7.setText("jTextField7");
		
		        jTextField8.setEditable(false);
		        jTextField8.setText("jTextField8");
		
		        jTextField25.setEditable(false);
		        jTextField25.setText("jTextField25");
		
		        jTextField26.setEditable(false);
		        jTextField26.setText("jTextField26");
		
		        jTextField27.setEditable(false);
		        jTextField27.setText("jTextField27");
		
		        jTextField28.setEditable(false);
		        jTextField28.setText("jTextField28");
		
		        jTextField29.setEditable(false);
		        jTextField29.setText("jTextField29");
		
		        jTextField30.setEditable(false);
		        jTextField30.setText("jTextField30");
		
		        jTextField31.setEditable(false);
		        jTextField31.setText("jTextField31");
		
		        jTextField32.setEditable(false);
		        jTextField32.setText("jTextField32");
		
		        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel21.setText("$");
		
		        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel22.setText("$");
		
		        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel23.setText("$");
		
		        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel24.setText("$");
		
		        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel25.setText("$");
		
		        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel26.setText("$");
		
		        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel27.setText("$");
		
		        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel28.setText("$");
		
		        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel3.setText("x");
		
		        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel5.setText("x");
		
		        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel8.setText("x");
		
		        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel12.setText("x");
		
		        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel17.setText("x");
		
		        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel18.setText("x");
		
		        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel19.setText("x");
		
		        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel20.setText("x");
		
		        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		        jPanel2.setLayout(jPanel2Layout);
		        jPanel2Layout.setHorizontalGroup(
		            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel2Layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(jPanel2Layout.createSequentialGroup()
		                        .addComponent(jLabel9)
		                        .addGap(0, 0, 0))
		                    .addGroup(jPanel2Layout.createSequentialGroup()
		                        .addGap(10, 10, 10)
		                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                            .addGroup(jPanel2Layout.createSequentialGroup()
		                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(18, 18, 18)
		                                .addComponent(jLabel28))
		                            .addGroup(jPanel2Layout.createSequentialGroup()
		                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(18, 18, 18)
		                                .addComponent(jLabel21))
		                            .addGroup(jPanel2Layout.createSequentialGroup()
		                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(18, 18, 18)
		                                .addComponent(jLabel22))
		                            .addGroup(jPanel2Layout.createSequentialGroup()
		                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(18, 18, 18)
		                                .addComponent(jLabel27))
		                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
		                                .addGap(0, 0, Short.MAX_VALUE)
		                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                    .addGroup(jPanel2Layout.createSequentialGroup()
		                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addGap(18, 18, 18)
		                                        .addComponent(jLabel23))
		                                    .addGroup(jPanel2Layout.createSequentialGroup()
		                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addGap(18, 18, 18)
		                                        .addComponent(jLabel24))
		                                    .addGroup(jPanel2Layout.createSequentialGroup()
		                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addGap(18, 18, 18)
		                                        .addComponent(jLabel25))
		                                    .addGroup(jPanel2Layout.createSequentialGroup()
		                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                        .addGap(18, 18, 18)
		                                        .addComponent(jLabel26)))))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(jPanel2Layout.createSequentialGroup()
		                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel5))
		                            .addGroup(jPanel2Layout.createSequentialGroup()
		                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel3))
		                            .addGroup(jPanel2Layout.createSequentialGroup()
		                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel8))
		                            .addGroup(jPanel2Layout.createSequentialGroup()
		                                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel20))
		                            .addGroup(jPanel2Layout.createSequentialGroup()
		                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel12))
		                            .addGroup(jPanel2Layout.createSequentialGroup()
		                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel17))
		                            .addGroup(jPanel2Layout.createSequentialGroup()
		                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel18))
		                            .addGroup(jPanel2Layout.createSequentialGroup()
		                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel19)))
		                        .addGap(10, 10, 10)
		                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                            .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jSpinner2, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jSpinner3, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jSpinner4, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jSpinner5, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jSpinner6, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jSpinner7, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jSpinner8))
		                        .addGap(40, 40, 40)))
		                .addGap(0, 0, 0))
		        );
		        jPanel2Layout.setVerticalGroup(
		            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel2Layout.createSequentialGroup()
		                .addGap(2, 2, 2)
		                .addComponent(jLabel9)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addComponent(jLabel21)
		                        .addComponent(jLabel3)))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel22)
		                    .addComponent(jLabel5))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel23)
		                    .addComponent(jLabel8))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel24)
		                    .addComponent(jLabel12))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel25)
		                    .addComponent(jLabel17))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel26)
		                    .addComponent(jLabel18))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel27)
		                    .addComponent(jLabel19))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel28)
		                    .addComponent(jLabel20))
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		        );
		
		        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
		        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
		
		        jLabel10.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
		        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
		        jLabel10.setText("SALADS");
		
		        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner9.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner9.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner10.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner10.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner11.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner11.getEditor()).getTextField().setEditable(false);
		        
		        jTextField9.setEditable(false);
		        jTextField9.setText("jTextField9");
		
		        jTextField10.setEditable(false);
		        jTextField10.setText("jTextField10");
		
		        jTextField11.setEditable(false);
		        jTextField11.setText("jTextField11");
		
		        jTextField33.setEditable(false);
		        jTextField33.setText("jTextField33");
		
		        jTextField34.setEditable(false);
		        jTextField34.setText("jTextField34");
		
		        jTextField35.setEditable(false);
		        jTextField35.setText("jTextField35");
		
		        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel29.setText("$");
		
		        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel30.setText("$");
		
		        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel31.setText("$");
		
		        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel45.setText("x");
		
		        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel46.setText("x");
		
		        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel47.setText("x");
		
		        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		        jPanel3.setLayout(jPanel3Layout);
		        jPanel3Layout.setHorizontalGroup(
		            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel3Layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(jPanel3Layout.createSequentialGroup()
		                        .addComponent(jLabel10)
		                        .addGap(0, 0, 0))
		                    .addGroup(jPanel3Layout.createSequentialGroup()
		                        .addGap(10, 10, 10)
		                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addGap(18, 18, 18)
		                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                            .addComponent(jLabel31)
		                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(jPanel3Layout.createSequentialGroup()
		                                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel45))
		                            .addGroup(jPanel3Layout.createSequentialGroup()
		                                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel47))
		                            .addGroup(jPanel3Layout.createSequentialGroup()
		                                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel46)))
		                        .addGap(10, 10, 10)
		                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jSpinner10, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jSpinner11, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jSpinner9))
		                        .addGap(40, 40, 40))))
		        );
		        jPanel3Layout.setVerticalGroup(
		            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel3Layout.createSequentialGroup()
		                .addGap(2, 2, 2)
		                .addComponent(jLabel10)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel29)
		                    .addComponent(jLabel45))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel30)
		                    .addComponent(jLabel46))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel31)
		                    .addComponent(jLabel47))
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		        );
		
		        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
		        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
		
		        jLabel11.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
		        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
		        jLabel11.setText("BAKED GOODS");
		
		        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner16.setMinimumSize(new java.awt.Dimension(39, 20));
		        jSpinner16.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner16.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner17.setMinimumSize(new java.awt.Dimension(39, 20));
		        jSpinner17.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner17.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner18.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner18.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner18.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner19.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner19.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner19.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner20.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner20.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner20.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner21.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner21.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner21.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner22.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner22.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner22.getEditor()).getTextField().setEditable(false);
		        
		        jTextField16.setEditable(false);
		        jTextField16.setText("jTextField16");
		        jTextField16.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jTextField16ActionPerformed(evt);
		            }
		        });
		
		        jTextField17.setEditable(false);
		        jTextField17.setText("jTextField17");
		
		        jTextField18.setEditable(false);
		        jTextField18.setText("jTextField18");
		
		        jTextField19.setEditable(false);
		        jTextField19.setText("jTextField19");
		
		        jTextField20.setEditable(false);
		        jTextField20.setText("jTextField20");
		
		        jTextField21.setEditable(false);
		        jTextField21.setText("jTextField21");
		
		        jTextField22.setEditable(false);
		        jTextField22.setText("jTextField22");
		        jTextField22.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jTextField22ActionPerformed(evt);
		            }
		        });
		
		        jTextField40.setEditable(false);
		        jTextField40.setText("jTextField40");
		
		        jTextField41.setEditable(false);
		        jTextField41.setText("jTextField41");
		
		        jTextField42.setEditable(false);
		        jTextField42.setText("jTextField42");
		
		        jTextField43.setEditable(false);
		        jTextField43.setText("jTextField43");
		
		        jTextField44.setEditable(false);
		        jTextField44.setText("jTextField44");
		
		        jTextField45.setEditable(false);
		        jTextField45.setText("jTextField45");
		
		        jTextField46.setEditable(false);
		        jTextField46.setText("jTextField46");
		
		        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel36.setText("$");
		
		        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel37.setText("$");
		
		        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel38.setText("$");
		
		        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel39.setText("$");
		
		        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel40.setText("$");
		
		        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel41.setText("$");
		
		        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel42.setText("$");
		
		        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel52.setText("x");
		
		        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel53.setText("x");
		
		        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel54.setText("x");
		
		        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel55.setText("x");
		
		        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel56.setText("x");
		
		        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel57.setText("x");
		
		        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel58.setText("x");
		
		        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		        jPanel4.setLayout(jPanel4Layout);
		        jPanel4Layout.setHorizontalGroup(
		            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel4Layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addComponent(jLabel11)
		                    .addGroup(jPanel4Layout.createSequentialGroup()
		                        .addGap(10, 10, 10)
		                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addGap(18, 18, 18)
		                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jLabel36)
		                            .addComponent(jLabel37)
		                            .addComponent(jLabel42)
		                            .addComponent(jLabel38)
		                            .addComponent(jLabel39)
		                            .addComponent(jLabel40)
		                            .addComponent(jLabel41))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING))
		                        .addGap(10, 10, 10)
		                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                                .addComponent(jSpinner17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
		                                .addComponent(jSpinner18, javax.swing.GroupLayout.Alignment.TRAILING)
		                                .addComponent(jSpinner19, javax.swing.GroupLayout.Alignment.TRAILING)
		                                .addComponent(jSpinner20, javax.swing.GroupLayout.Alignment.TRAILING)
		                                .addComponent(jSpinner21, javax.swing.GroupLayout.Alignment.TRAILING)
		                                .addComponent(jSpinner22, javax.swing.GroupLayout.Alignment.TRAILING))
		                            .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
		                .addGap(20, 20, 20))
		        );
		        jPanel4Layout.setVerticalGroup(
		            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel4Layout.createSequentialGroup()
		                .addGap(2, 2, 2)
		                .addComponent(jLabel11)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel36)
		                    .addComponent(jLabel52))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel37)
		                    .addComponent(jLabel53))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel38)
		                    .addComponent(jLabel54))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel39)
		                    .addComponent(jLabel55))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel40)
		                    .addComponent(jLabel56))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel41)
		                    .addComponent(jLabel57))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jSpinner22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel42)
		                    .addComponent(jLabel58))
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		        );
		
		        jPanel6.setBackground(new java.awt.Color(204, 153, 255));
		        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
		
		        jLabel13.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
		        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
		        jLabel13.setText("SANDWICHES");
		
		        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner12.setMinimumSize(new java.awt.Dimension(39, 20));
		        jSpinner12.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner12.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner13.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner13.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner14.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner14.getEditor()).getTextField().setEditable(false);
		        
		        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner15.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner15.getEditor()).getTextField().setEditable(false);
		        
		        jTextField12.setEditable(false);
		        jTextField12.setText("jTextField12");
		
		        jTextField13.setEditable(false);
		        jTextField13.setText("jTextField13");
		
		        jTextField14.setEditable(false);
		        jTextField14.setText("jTextField14");
		
		        jTextField15.setEditable(false);
		        jTextField15.setText("jTextField15");
		
		        jTextField36.setEditable(false);
		        jTextField36.setText("jTextField36");
		
		        jTextField37.setEditable(false);
		        jTextField37.setText("jTextField37");
		
		        jTextField38.setEditable(false);
		        jTextField38.setText("jTextField38");
		
		        jTextField39.setEditable(false);
		        jTextField39.setText("jTextField39");
		
		        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel32.setText("$");
		
		        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel33.setText("$");
		
		        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel34.setText("$");
		
		        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel35.setText("$");
		
		        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel48.setText("x");
		
		        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel49.setText("x");
		
		        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel50.setText("x");
		
		        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel51.setText("x");
		
		        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		        jPanel6.setLayout(jPanel6Layout);
		        jPanel6Layout.setHorizontalGroup(
		            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel6Layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(jPanel6Layout.createSequentialGroup()
		                        .addComponent(jLabel13)
		                        .addGap(0, 0, 0))
		                    .addGroup(jPanel6Layout.createSequentialGroup()
		                        .addGap(10, 10, 10)
		                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addGap(18, 18, 18)
		                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                            .addComponent(jLabel35)
		                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(jPanel6Layout.createSequentialGroup()
		                                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel49))
		                            .addGroup(jPanel6Layout.createSequentialGroup()
		                                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel48))
		                            .addGroup(jPanel6Layout.createSequentialGroup()
		                                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel51))
		                            .addGroup(jPanel6Layout.createSequentialGroup()
		                                .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jLabel50)))
		                        .addGap(10, 10, 10)
		                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                            .addComponent(jSpinner12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
		                            .addComponent(jSpinner13, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jSpinner14, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jSpinner15, javax.swing.GroupLayout.Alignment.TRAILING))
		                        .addGap(20, 20, 20))))
		        );
		        jPanel6Layout.setVerticalGroup(
		            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel6Layout.createSequentialGroup()
		                .addGap(2, 2, 2)
		                .addComponent(jLabel13)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel32)
		                    .addComponent(jLabel48))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel33)
		                    .addComponent(jLabel49))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel34)
		                    .addComponent(jLabel50))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel35)
		                    .addComponent(jLabel51))
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		        );
		
		        jPanel7.setBackground(new java.awt.Color(253, 193, 103));
		        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
		
		        jLabel14.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
		        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
		        jLabel14.setText("CAT FOOD");
		
		        jSpinner23.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner23.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner23.getEditor()).getTextField().setEditable(false);
		        
		        jTextField23.setEditable(false);
		        jTextField23.setText("jTextField23");
		        jTextField23.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jTextField23ActionPerformed(evt);
		            }
		        });
		
		        jTextField24.setEditable(false);
		        jTextField24.setText("jTextField24");
		        jTextField24.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jTextField24ActionPerformed(evt);
		            }
		        });
		
		        jSpinner24.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		        jSpinner24.addChangeListener(spinnerCL);	
		        ((DefaultEditor) jSpinner24.getEditor()).getTextField().setEditable(false);
		        
		        jTextField47.setEditable(false);
		        jTextField47.setText("jTextField47");
		
		        jTextField48.setEditable(false);
		        jTextField48.setText("jTextField48");
		
		        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel43.setText("$");
		
		        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel44.setText("$");
		
		        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel59.setText("x");
		
		        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		        jLabel60.setText("x");
		
		        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		        jPanel7.setLayout(jPanel7Layout);
		        jPanel7Layout.setHorizontalGroup(
		            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel7Layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(jPanel7Layout.createSequentialGroup()
		                        .addComponent(jLabel43)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(6, 6, 6)
		                        .addComponent(jLabel59)
		                        .addGap(5, 5, 5)
		                        .addComponent(jSpinner23, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
		                            .addGap(11, 11, 11)
		                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                    .addGroup(jPanel7Layout.createSequentialGroup()
		                        .addComponent(jLabel44)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addGroup(jPanel7Layout.createSequentialGroup()
		                                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(6, 6, 6)
		                                .addComponent(jLabel60)
		                                .addGap(5, 5, 5)
		                                .addComponent(jSpinner24, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
		                .addGap(10, 10, 10))
		        );
		        jPanel7Layout.setVerticalGroup(
		            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel7Layout.createSequentialGroup()
		                .addComponent(jLabel14)
		                .addGap(8, 8, 8)
		                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel43)
		                    .addComponent(jLabel59))
		                .addGap(30, 30, 30)
		                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jSpinner24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel44)
		                    .addComponent(jLabel60))
		                .addGap(30, 30, 30))
		        );
		
		        jPanel8.setBackground(new java.awt.Color(229, 229, 229));
		        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
		
		        jLabel15.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
		        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
		        jLabel15.setText("SEARCH ORDER");
		
		        jTextArea1.setEditable(false);
		        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
		        jTextArea1.setColumns(20);
		        jTextArea1.setRows(5);
		        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
		        jScrollPane1.setViewportView(jTextArea1);
		
		        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		        jLabel61.setText("Search Order #");
		
		       // jTextField49.setEditable(false);
		      //  jTextField49.setText("jTextField49");
		        jTextField49.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jTextField49ActionPerformed(evt);
		            }
		        });
		
		        jButton4.setText("SEARCH");
		        jButton4.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton4ActionPerformed(evt);
		            }
		        });
		
		        jButton5.setText("SHOW ALL ORDERS");
		        jButton5.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton5ActionPerformed(evt);
		            }
		        });
		
		        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		        jPanel8.setLayout(jPanel8Layout);
		        jPanel8Layout.setHorizontalGroup(
		            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel8Layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(jPanel8Layout.createSequentialGroup()
		                        .addGap(10, 10, 10)
		                        .addComponent(jLabel61)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jButton4)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                        .addComponent(jButton5)
		                        .addGap(27, 27, 27))
		                    .addGroup(jPanel8Layout.createSequentialGroup()
		                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jLabel15)
		                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		        );
		        jPanel8Layout.setVerticalGroup(
		            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel8Layout.createSequentialGroup()
		                .addGap(2, 2, 2)
		                .addComponent(jLabel15)
		                .addGap(1, 1, 1)
		                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jLabel61)
		                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jButton4)
		                    .addComponent(jButton5))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addComponent(jScrollPane1)
		                .addContainerGap())
		        );

        jPanel9.setBackground(new java.awt.Color(254, 254, 143));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        jLabel16.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("ORDER TOTAL");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel62.setText("Your order total is ");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel63.setText("$");

        getjTextField50().setEditable(false);
    //    jTextField50.setText()("jTextField50");
        getjTextField50().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField50ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText(" DELETE ORDER ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setText("PAY ORDER");
        jButton7.addActionListener(new ActionListener () {
         	public void actionPerformed(ActionEvent e) {
         	menu.setVisible(false);
         	logout.setVisible(true);
         	}
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(28, 28, 28)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getjTextField50(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63)
                    .addComponent(getjTextField50(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("MENU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        pack();
    }// </editor-fold>                        

    public int AdoptCount = 0;
    public double adoptionFee;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	AdoptCount += 1;
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	AdoptCount += 1;
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	AdoptCount += 1;
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jTextField49ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextField50ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */					//"WOW! It's the new Nimbus 2000! It's the FASTest Model yET!"
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //jTextField50.setText(calculatePrice()); //call calculatePrice method
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NetBeansCatCafeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NetBeansCatCafeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NetBeansCatCafeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NetBeansCatCafeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NetBeansCatCafeMenu().setVisible(true);     //remember what Claudiu said to Caitlin about the three different menus being visible and invisible
            }
        });
    }

    public javax.swing.JTextField getjTextField50() {	
    	return jTextField50;			
    	}			
    public void setjTextField50(javax.swing.JTextField jTextField50) {			
    	this.jTextField50 = jTextField50;			
    	}
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner19;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner20;
    private javax.swing.JSpinner jSpinner21;
    private javax.swing.JSpinner jSpinner22;
    private javax.swing.JSpinner jSpinner23;
    private javax.swing.JSpinner jSpinner24;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration  
    
    public JTextComponent getjTextArea1() {			
    	return jTextArea1;			
    	}
}


class SpinnerListener implements ChangeListener {
	  NetBeansCatCafeMenu p;
	  //other arraylist to point to same prices
	  
	  SpinnerListener(NetBeansCatCafeMenu parent) {	//
	  p = parent;
	  }
	  
	  public void setTextField50(String finalTotalS) {
	  p.getjTextField50().setText(finalTotalS);
	  }
	  
	  public void setjTextArea1(String printedReceipt) {
	  p.getjTextArea1().setText(printedReceipt);
	  }
	  
	  public void stateChanged(ChangeEvent e) {
	      // for for iterating ar_js
	           
	      JSpinner s1  = p.js.get(0);
	      Integer quantity1 = (Integer) (s1.getValue());
	      
	      JSpinner s2  = p.js.get(1);
	      Integer quantity2 = (Integer) (s2.getValue());
	      
	      JSpinner s3  = p.js.get(2);
	      Integer quantity3 = (Integer) (s3.getValue());
	      
	      JSpinner s4  = p.js.get(3);
	      Integer quantity4 = (Integer) (s4.getValue());
	      
	      JSpinner s5  = p.js.get(4);
	      Integer quantity5 = (Integer) (s5.getValue());
	      
	      JSpinner s6  = p.js.get(5);
	      Integer quantity6 = (Integer) (s6.getValue());
	      
	      JSpinner s7  = p.js.get(6);
	      Integer quantity7 = (Integer) (s7.getValue());
	      
	      JSpinner s8  = p.js.get(7);
	      Integer quantity8 = (Integer) (s8.getValue());
	      
	      JSpinner s9  = p.js.get(8);
	      Integer quantity9 = (Integer) (s9.getValue());
	      
	      JSpinner s10  = p.js.get(9);
	      Integer quantity10 = (Integer) (s10.getValue());
	      
	      JSpinner s11  = p.js.get(10);
	      Integer quantity11 = (Integer) (s11.getValue());
	      
	      JSpinner s12  = p.js.get(11);
	      Integer quantity12 = (Integer) (s12.getValue());
	      
	      JSpinner s13  = p.js.get(12);
	      Integer quantity13 = (Integer) (s13.getValue());
	      
	      JSpinner s14  = p.js.get(13);
	      Integer quantity14 = (Integer) (s14.getValue());
	      
	      JSpinner s15  = p.js.get(14);
	      Integer quantity15 = (Integer) (s15.getValue());
	      
	      JSpinner s16  = p.js.get(15);
	      Integer quantity16 = (Integer) (s16.getValue());
	      
	      JSpinner s17  = p.js.get(16);
	      Integer quantity17 = (Integer) (s17.getValue());
	      
	      JSpinner s18  = p.js.get(17);
	      Integer quantity18 = (Integer) (s18.getValue());
	      
	      JSpinner s19  = p.js.get(18);
	      Integer quantity19 = (Integer) (s19.getValue());
	      
	      JSpinner s20  = p.js.get(19);
	      Integer quantity20 = (Integer) (s20.getValue());
	      
	      JSpinner s21  = p.js.get(20);
	      Integer quantity21 = (Integer) (s21.getValue());
	      
	      JSpinner s22  = p.js.get(21);
	      Integer quantity22 = (Integer) (s22.getValue());
	      
	      JSpinner s23  = p.js.get(22);
	      Integer quantity23 = (Integer) (s23.getValue());
	      
	      JSpinner s24  = p.js.get(23);
	      Integer quantity24 = (Integer) (s24.getValue());
	     
		
			String receipt = " RECEIPT \n \n";
			
			double truePrice1 = quantity1 * p.getDrinkPrices(0);
			if (truePrice1 > 0) {
			receipt += " " + quantity1 + "x " + " " + p.getDrinkNames(0) +  "                "
			+ "                                  $" + truePrice1 + "\n";
			}
			
			double truePrice2 = quantity2 * p.getDrinkPrices(1);
			if (truePrice2 > 0) {
			receipt += " " + quantity2 + "x " + " " + p.getDrinkNames(1) +  "                "
			+ "                          $" + truePrice2 + "\n";
			}
			
			double truePrice3 = quantity3 * p.getDrinkPrices(2);
			if (truePrice3 > 0) {
			receipt += " " + quantity3 + "x " + " " + p.getDrinkNames(2) +  "                "
			+ "                                  $" + truePrice3 + "\n";
			}
			
			double truePrice4 = quantity4 * p.getDrinkPrices(3);
			if (truePrice4 > 0) {
			receipt += " " + quantity4 + "x " + " " + p.getDrinkNames(3) +  "                "
			+ "                                    $" + truePrice4 + "\n";
			}
			
			double truePrice5 = quantity5 * p.getDrinkPrices(4);
			if (truePrice5 > 0) {
			receipt += " " + quantity5 + "x " + " " + p.getDrinkNames(4) +  "                "
			+ "                             $" + truePrice5 + "\n";
			}
			
			double truePrice6 = quantity6 * p.getDrinkPrices(5);
			if (truePrice6 > 0) {
			receipt += " " + quantity6 + "x " + " " + p.getDrinkNames(5) +  "                "
			+ "                            $" + truePrice6 + "\n";
			}
			
			double truePrice7 = quantity7 * p.getDrinkPrices(6);
			if (truePrice7 > 0) {
			receipt += " " + quantity7 + "x " + " " + p.getDrinkNames(6) +  "                "
			+ "                         $" + truePrice7 + "\n";
			}
			
			double truePrice8 = quantity8 * p.getDrinkPrices(7);
			if (truePrice8 > 0) {
			receipt += " " + quantity8 + "x " + " " + p.getDrinkNames(7) +  "                "
			+ "                                   $" + truePrice8 + "\n";
			}
			
			double truePrice9 = quantity9 * p.getSaladsPrices(0);
			if (truePrice9 > 0) {
			receipt += " " + quantity9 + "x " + " " + p.getSaladsNames(0) + "                "
			+ "                         $" + truePrice9 + "\n";
			}
			
			double truePrice10 = quantity10 * p.getSaladsPrices(1);
			if (truePrice10 > 0) {
			receipt += " " + quantity10 + "x " + " " + p.getSaladsNames(1) + "                "
			+ "                         $" + truePrice10 + "\n";
			}
			
			
			double truePrice11 = quantity11 * p.getSaladsPrices(2);	
			if (truePrice11 > 0) {
			receipt += " " + quantity11 + "x " + " " + p.getSaladsNames(2) + "                "
			+ "                          $" + truePrice11 + "\n";
			}
			
			double truePrice12 = quantity12 * p.getSandwichesPrices(0);
			if (truePrice12 > 0) {
			receipt += " " + quantity12 + "x " + " " + p.getSandwichesNames(0) +  "                "
			+ "      $" + truePrice12 + "\n";
			}
			
			double truePrice13 = quantity13 * p.getSandwichesPrices(1);
			if (truePrice13 > 0) {
			receipt += " " + quantity13 + "x " + " " + p.getSandwichesNames(1) +  "                "
			+ "                         $" + truePrice13 + "\n";
			}
			
			double truePrice14 = quantity14 * p.getSandwichesPrices(2);
			if (truePrice14 > 0) {
			receipt += " " + quantity14 + "x " + " " + p.getSandwichesNames(2) +  "                "
			+ "                          $" + truePrice14 + "\n";
			}
			
			
			double truePrice15 = quantity15 * p.getSandwichesPrices(3);
			if (truePrice15 > 0) {
			receipt += " " + quantity15 + "x " + " " + p.getSandwichesNames(3) +  "                "
			+ "                       $" + truePrice15 + "\n";
			}
			
			double truePrice16 = quantity16 * p.getBakedGoodsPrices(0);
			if (truePrice16 > 0) {
			receipt += " " + quantity16 + "x " + " " + p.getBakedGoodsNames(0) +  "                "
			+ "                              $" + truePrice16 + "\n";
			}
			
			double truePrice17 = quantity17 * p.getBakedGoodsPrices(1);
			if (truePrice17 > 0) {
			receipt += " " + quantity17 + "x " + " " + p.getBakedGoodsNames(1) +  "                "
			+ "                    $" + truePrice17 + "\n";
			}
			
			double truePrice18 = quantity18 * p.getBakedGoodsPrices(2);
			if (truePrice18 > 0) {
			receipt += " " + quantity18 + "x " + " " + p.getBakedGoodsNames(2) +  "                "
			+ "                    $" + truePrice18 + "\n";
			}
			
			double truePrice19 = quantity19 * p.getBakedGoodsPrices(3);
			if (truePrice19 > 0) {
			receipt += " " + quantity19 + "x " + " " + p.getBakedGoodsNames(3) +  "                "
			+ "                     $" + truePrice19 + "\n";
			}
			
			double truePrice20 = quantity20 * p.getBakedGoodsPrices(4);
			if (truePrice20 > 0) {
			receipt += " " + quantity20 + "x " + " " + p.getBakedGoodsNames(4) +  "                "
			+ "               $" + truePrice20 + "\n";
			}
			
			double truePrice21 = quantity21 * p.getBakedGoodsPrices(5);
			if (truePrice21 > 0) {
			receipt += " " + quantity21 + "x " + " " + p.getBakedGoodsNames(5) +  "                "
			+ "                     $" + truePrice21 + "\n";
			}
			
			double truePrice22 = quantity22 * p.getBakedGoodsPrices(6);
			if (truePrice22 > 0) {
			receipt += " " + quantity22 + "x " + " " + p.getBakedGoodsNames(6) +  "                "
			+ "                          $" + truePrice22 + "\n";
			}
			
			double truePrice23 = quantity23 * p.getCatFoodPrices(0);
			if (truePrice23 > 0) {
			receipt += " " + quantity23 + "x " + " " + p.getCatFoodNames(0) +  "                "
			+ "                       $" + truePrice23 + "\n";
			}
			
			double truePrice24 = quantity24 * p.getCatFoodPrices(1);
			if (truePrice24 > 0) {
			receipt += " " + quantity24 + "x " + " " + p.getCatFoodNames(1) +  "                "
			+ "                      $" + truePrice24 + "\n";
			}
			
			p.adoptionFee = p.AdoptCount *67.00;
			if (p.AdoptCount > 0) {
			receipt += " " + p.AdoptCount + "x " + " " + "Adoption Fee" +  "                "
			+ "                        $" + p.adoptionFee + "0"+ "\n";
			}
		
			
			setjTextArea1(receipt);
			
			double finalTotalDouble = truePrice1 + truePrice2 + truePrice3 + truePrice4 + truePrice5 + truePrice6 + truePrice7 + truePrice8 + truePrice9 + truePrice10 +
			truePrice11 + truePrice12 + truePrice13 + truePrice14 + truePrice15 + truePrice16 + truePrice17 + truePrice18 + truePrice19 + truePrice20 +
			truePrice21 + truePrice22 + truePrice23 + truePrice24 + p.adoptionFee;
			
			String finalTotalString = String.valueOf(finalTotalDouble);
		
			setTextField50(finalTotalString);
			
			// must be implemented
			
	  			}
			}


//array of textfields related to array of items
//ith textfield from array setText to string return for ith item from menu (specifically from that class)

//getName and getPrice for the two text fields
//drinks name and drinks price are in a file that isn't main, it just gets used to find data