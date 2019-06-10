package com.openbravo.pos.inventory;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.image.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import com.openbravo.pos.forms.AppLocal;
import com.openbravo.format.Formats;
import com.openbravo.basic.BasicException;
import com.openbravo.data.gui.ComboBoxValModel;
import com.openbravo.data.loader.SentenceList;
import com.openbravo.data.user.EditorRecord;
import com.openbravo.data.user.DirtyManager;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.pos.panels.JProductFinder;
import com.openbravo.pos.sales.TaxesLogic;
import com.openbravo.pos.ticket.ProductInfoExt;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductsEditor extends JPanel implements EditorRecord {
       
    private SentenceList m_sentcat;
    private ComboBoxValModel m_CategoryModel;

    private SentenceList taxcatsent;
    private ComboBoxValModel taxcatmodel;  

    private SentenceList attsent;
    private ComboBoxValModel attmodel;
    
    private SentenceList taxsent;
    private TaxesLogic taxeslogic;
    
    private ComboBoxValModel m_CodetypeModel;
    
    private Object m_id;
    private Object pricesell;
    private boolean priceselllock = false;
    private DataLogicSales dlSales;
    private boolean reportlock = false;
    /** Creates new form JEditProduct */
    public ProductsEditor(DataLogicSales dlSales, DirtyManager dirty) {
        initComponents();
        
        // The taxes sentence
        taxsent = dlSales.getTaxList();
             
        // The categories model
        m_sentcat = dlSales.getCategoriesList();
        m_CategoryModel = new ComboBoxValModel();
        
        // The taxes model
        taxcatsent = dlSales.getTaxCategoriesList();
        taxcatmodel = new ComboBoxValModel();

        // The attributes model
        attsent = dlSales.getAttributeSetList();
        attmodel = new ComboBoxValModel();
        
        m_CodetypeModel = new ComboBoxValModel();
        m_CodetypeModel.add(null);
        m_CodetypeModel.add(CodeType.EAN13);
        m_CodetypeModel.add(CodeType.CODE128);
        m_jCodetype.setModel(m_CodetypeModel);
        m_jCodetype.setVisible(false);
               
        m_jRef.getDocument().addDocumentListener(dirty);
        m_jCode.getDocument().addDocumentListener(dirty);
        m_jName.getDocument().addDocumentListener(dirty);
        m_jComment.addActionListener(dirty);
        m_jScale.addActionListener(dirty);
        m_jCategory.addActionListener(dirty);
        m_jTax.addActionListener(dirty);
        m_jAtt.addActionListener(dirty);
        m_jPriceBuy.getDocument().addDocumentListener(dirty);
        m_jPriceSell.getDocument().addDocumentListener(dirty);
        m_jPriceSell1.getDocument().addDocumentListener(dirty);
        m_jPriceSell2.getDocument().addDocumentListener(dirty);
        m_jPriceSell3.getDocument().addDocumentListener(dirty);
        m_jPriceSell4.getDocument().addDocumentListener(dirty);
        m_jPriceSell5.getDocument().addDocumentListener(dirty);
        m_jPriceSell6.getDocument().addDocumentListener(dirty);
        m_jPriceSell7.getDocument().addDocumentListener(dirty);
        m_jPriceSell8.getDocument().addDocumentListener(dirty);
        m_jPriceSell9.getDocument().addDocumentListener(dirty);
        m_jPriceSell10.getDocument().addDocumentListener(dirty);
        m_jPriceSell11.getDocument().addDocumentListener(dirty);
        m_jPriceSell12.getDocument().addDocumentListener(dirty);
        m_jPriceSell13.getDocument().addDocumentListener(dirty);
        m_jPriceSell14.getDocument().addDocumentListener(dirty);
        m_jPriceSell15.getDocument().addDocumentListener(dirty);
        m_jPriceSell16.getDocument().addDocumentListener(dirty);
        m_jPriceSell17.getDocument().addDocumentListener(dirty);
        m_jPriceSell18.getDocument().addDocumentListener(dirty);
        m_jPriceSell19.getDocument().addDocumentListener(dirty);
        m_jPriceSell20.getDocument().addDocumentListener(dirty);
        m_jPriceSell21.getDocument().addDocumentListener(dirty);
        m_jPriceSell22.getDocument().addDocumentListener(dirty);
        m_jPriceSell23.getDocument().addDocumentListener(dirty);
        m_jPriceSell24.getDocument().addDocumentListener(dirty);
        m_jPriceSell25.getDocument().addDocumentListener(dirty);
        m_jPriceSell26.getDocument().addDocumentListener(dirty);
        m_jPriceSell27.getDocument().addDocumentListener(dirty);
        m_jPriceSell28.getDocument().addDocumentListener(dirty);
        m_jPriceSell29.getDocument().addDocumentListener(dirty);
        m_jPriceSell30.getDocument().addDocumentListener(dirty);
        m_jPriceSell31.getDocument().addDocumentListener(dirty);
        m_jPriceSell32.getDocument().addDocumentListener(dirty);
        m_jPriceSell33.getDocument().addDocumentListener(dirty);
        m_jPriceSell34.getDocument().addDocumentListener(dirty);
        m_jPriceSell35.getDocument().addDocumentListener(dirty);
        m_jPriceSell36.getDocument().addDocumentListener(dirty);
        m_jPriceSell37.getDocument().addDocumentListener(dirty);
        m_jPriceSell38.getDocument().addDocumentListener(dirty);
        m_jPriceSell39.getDocument().addDocumentListener(dirty);
        m_jPriceSell40.getDocument().addDocumentListener(dirty);
        m_jPriceSell41.getDocument().addDocumentListener(dirty);
        m_jPriceSell42.getDocument().addDocumentListener(dirty);
        m_jPriceSell43.getDocument().addDocumentListener(dirty);
        
        
        m_jPriceBuy1.getDocument().addDocumentListener(dirty);
        m_jPriceBuy2.getDocument().addDocumentListener(dirty);
        m_jPriceBuy3.getDocument().addDocumentListener(dirty);
        m_jPriceBuy4.getDocument().addDocumentListener(dirty);
        m_jPriceBuy5.getDocument().addDocumentListener(dirty);
        m_jPriceBuy6.getDocument().addDocumentListener(dirty);
        m_jPriceBuy7.getDocument().addDocumentListener(dirty);
        m_jPriceBuy8.getDocument().addDocumentListener(dirty);
        m_jPriceBuy9.getDocument().addDocumentListener(dirty);
        m_jPriceBuy10.getDocument().addDocumentListener(dirty);
        m_jPriceBuy11.getDocument().addDocumentListener(dirty);
        m_jPriceBuy12.getDocument().addDocumentListener(dirty);
        m_jPriceBuy13.getDocument().addDocumentListener(dirty);
        m_jPriceBuy14.getDocument().addDocumentListener(dirty);
        m_jPriceBuy15.getDocument().addDocumentListener(dirty);
        m_jPriceBuy16.getDocument().addDocumentListener(dirty);
        m_jPriceBuy17.getDocument().addDocumentListener(dirty);
        m_jPriceBuy18.getDocument().addDocumentListener(dirty);
        m_jPriceBuy19.getDocument().addDocumentListener(dirty);
        m_jPriceBuy20.getDocument().addDocumentListener(dirty);
        m_jPriceBuy21.getDocument().addDocumentListener(dirty);
        m_jPriceBuy22.getDocument().addDocumentListener(dirty);
        m_jPriceBuy1S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy2S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy3S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy4S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy5S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy6S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy7S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy8S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy9S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy10S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy11S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy12S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy13S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy14S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy15S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy16S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy17S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy18S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy19S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy20S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy21S.getDocument().addDocumentListener(dirty);
        m_jPriceBuy22S.getDocument().addDocumentListener(dirty);
        
        
        
        
        m_jImage.addPropertyChangeListener("image", dirty);
        m_jstockcost.getDocument().addDocumentListener(dirty);
        m_jstockvolume.getDocument().addDocumentListener(dirty);
        m_jInCatalog.addActionListener(dirty);
        m_jCatalogOrder.getDocument().addDocumentListener(dirty);
        txtAttributes.getDocument().addDocumentListener(dirty);
/*
        FieldsManager fm = new FieldsManager();
        m_jPriceBuy.getDocument().addDocumentListener(fm);
        m_jPriceSell.getDocument().addDocumentListener(new PriceSellManager());
        m_jTax.addActionListener(fm);
        
        m_jPriceSellTax.getDocument().addDocumentListener(new PriceTaxManager());
        m_jmargin.getDocument().addDocumentListener(new MarginManager());
        */
        writeValueEOF();
    }
    
    public void activate() throws BasicException {
        
        // Load the taxes logic
        taxeslogic = new TaxesLogic(taxsent.list());        
        
        m_CategoryModel = new ComboBoxValModel(m_sentcat.list());
        m_jCategory.setModel(m_CategoryModel);

        taxcatmodel = new ComboBoxValModel(taxcatsent.list());
        m_jTax.setModel(taxcatmodel);

        attmodel = new ComboBoxValModel(attsent.list());
        attmodel.add(0, null);
        m_jAtt.setModel(attmodel);
    }
    
    public void refresh() {
    }    
    
    public void writeValueEOF() {
        
        reportlock = true;
        // Los valores
        m_jTitle.setText(AppLocal.getIntString("label.recordeof"));
        m_id = null;
        m_jRef.setText(null);
        m_jCode.setText(null);
        m_jName.setText(null);
        m_jComment.setSelected(false);
        m_jScale.setSelected(false);
        m_CategoryModel.setSelectedKey(null);
        taxcatmodel.setSelectedKey(null);
        attmodel.setSelectedKey(null);
        m_jPriceBuy.setText("0.00");
        m_jPriceSell.setText("0.00");
        m_jPriceSell1.setText("0.00");
        m_jPriceSell2.setText("0.00");
        m_jPriceSell3.setText("0.00");
        m_jPriceSell4.setText("0.00");
        m_jPriceSell5.setText("0.00");
        m_jPriceSell6.setText("0.00");
        m_jPriceSell7.setText("0.00");
        m_jPriceSell8.setText("0.00");
        m_jPriceSell9.setText("0.00");
        m_jPriceSell10.setText("0.00");
        m_jPriceSell11.setText("0.00");
        m_jPriceSell12.setText("0.00");
        m_jPriceSell13.setText("0.00");
        m_jPriceSell14.setText("0.00");
        m_jPriceSell15.setText("0.00");
        m_jPriceSell16.setText("0.00");
        m_jPriceSell17.setText("0.00");
        m_jPriceSell18.setText("0.00");
        m_jPriceSell19.setText("0.00");
        m_jPriceSell20.setText("0.00");
        m_jPriceSell21.setText("0.00");
        m_jPriceSell22.setText("0.00");
        m_jPriceSell23.setText("0.00");
        m_jPriceSell24.setText("0.00");
        m_jPriceSell25.setText("0.00");
        m_jPriceSell26.setText("0.00");
        m_jPriceSell27.setText("0.00");
        m_jPriceSell28.setText("0.00");
        m_jPriceSell29.setText("0.00");
        m_jPriceSell30.setText("0.00");
        m_jPriceSell31.setText("0.00");
        m_jPriceSell32.setText("0.00");
        m_jPriceSell34.setText("0.00");
        m_jPriceSell35.setText("0.00");
        m_jPriceSell36.setText("0.00");
        m_jPriceSell37.setText("0.00");
        m_jPriceSell38.setText("0.00");
        m_jPriceSell39.setText("0.00");
        m_jPriceSell40.setText("0.00");
        m_jPriceSell41.setText("0.00");
        m_jPriceSell42.setText("0.00");
        m_jPriceSell43.setText("0.00");
        m_jPriceBuy1.setText("0.00");
        m_jPriceBuy2.setText("0.00");
        m_jPriceBuy3.setText("0.00");
        m_jPriceBuy4.setText("0.00");
        m_jPriceBuy5.setText("0.00");
        m_jPriceBuy6.setText("0.00");
        m_jPriceBuy7.setText("0.00");
        m_jPriceBuy8.setText("0.00");
        m_jPriceBuy9.setText("0.00");
        m_jPriceBuy10.setText("0.00");
        m_jPriceBuy11.setText("0.00");
        m_jPriceBuy12.setText("0.00");
        m_jPriceBuy13.setText("0.00");
        m_jPriceBuy14.setText("0.00");
        m_jPriceBuy15.setText("0.00");
        m_jPriceBuy16.setText("0.00");
        m_jPriceBuy17.setText("0.00");
        m_jPriceBuy18.setText("0.00");
        m_jPriceBuy19.setText("0.00");
        m_jPriceBuy20.setText("0.00");
        m_jPriceBuy21.setText("0.00");
        m_jPriceBuy22.setText("0.00");
        m_jPriceBuy1S.setText("0.00");
        m_jPriceBuy2S.setText("0.00");
        m_jPriceBuy3S.setText("0.00");
        m_jPriceBuy4S.setText("0.00");
        m_jPriceBuy5S.setText("0.00");
        m_jPriceBuy6S.setText("0.00");
        m_jPriceBuy7S.setText("0.00");
        m_jPriceBuy8S.setText("0.00");
        m_jPriceBuy9S.setText("0.00");
        m_jPriceBuy10S.setText("0.00");
        m_jPriceBuy11S.setText("0.00");
        m_jPriceBuy12S.setText("0.00");
        m_jPriceBuy13S.setText("0.00");
        m_jPriceBuy14S.setText("0.00");
        m_jPriceBuy15S.setText("0.00");
        m_jPriceBuy16S.setText("0.00");
        m_jPriceBuy17S.setText("0.00");
        m_jPriceBuy18S.setText("0.00");
        m_jPriceBuy19S.setText("0.00");
        m_jPriceBuy20S.setText("0.00");
        m_jPriceBuy21S.setText("0.00");
        m_jPriceBuy22S.setText("0.00");
        
        m_jImage.setImage(null);
        m_jstockcost.setText(null);
        m_jstockvolume.setText(null);
        m_jInCatalog.setSelected(false);
        m_jCatalogOrder.setText(null);
        txtAttributes.setText(null);
        reportlock = false;
        
        m_jRef.setEnabled(false);
        m_jCode.setEnabled(false);
        m_jName.setEnabled(false);
        m_jComment.setEnabled(false);
        m_jScale.setEnabled(false);
        m_jCategory.setEnabled(false);
        m_jTax.setEnabled(false);
        m_jAtt.setEnabled(false);
        m_jPriceBuy.setEnabled(false);
        m_jPriceSell.setEnabled(false);
        
        m_jPriceSell1.setEnabled(false);
        m_jPriceSell2.setEnabled(false);
        m_jPriceSell3.setEnabled(false);
        m_jPriceSell4.setEnabled(false);
        m_jPriceSell5.setEnabled(false);
        m_jPriceSell6.setEnabled(false);
        m_jPriceSell7.setEnabled(false);
        m_jPriceSell8.setEnabled(false);
        m_jPriceSell9.setEnabled(false);
        m_jPriceSell10.setEnabled(false);
        m_jPriceSell11.setEnabled(false);
        m_jPriceSell12.setEnabled(false);
        m_jPriceSell13.setEnabled(false);
        m_jPriceSell14.setEnabled(false);
        m_jPriceSell15.setEnabled(false);
        m_jPriceSell16.setEnabled(false);
        m_jPriceSell17.setEnabled(false);
        m_jPriceSell18.setEnabled(false);
        m_jPriceSell19.setEnabled(false);
        m_jPriceSell20.setEnabled(false);
        m_jPriceSell21.setEnabled(false);
        m_jPriceSell22.setEnabled(false);
        m_jPriceSell23.setEnabled(false);
        m_jPriceSell24.setEnabled(false);
        m_jPriceSell25.setEnabled(false);
        m_jPriceSell26.setEnabled(false);
        m_jPriceSell27.setEnabled(false);
        m_jPriceSell28.setEnabled(false);
        m_jPriceSell29.setEnabled(false);
        m_jPriceSell30.setEnabled(false);
        m_jPriceSell31.setEnabled(false);
        m_jPriceSell32.setEnabled(false);
        m_jPriceSell33.setEnabled(false);
        m_jPriceSell34.setEnabled(false);
        m_jPriceSell35.setEnabled(false);
        m_jPriceSell36.setEnabled(false);
        m_jPriceSell37.setEnabled(false);
        m_jPriceSell38.setEnabled(false);
        m_jPriceSell39.setEnabled(false);
        m_jPriceSell40.setEnabled(false);
        m_jPriceSell41.setEnabled(false);
        m_jPriceSell42.setEnabled(false);
        m_jPriceSell43.setEnabled(false);
        
        m_jPriceBuy1.setEnabled(false);
        m_jPriceBuy2.setEnabled(false);
        m_jPriceBuy3.setEnabled(false);
        m_jPriceBuy4.setEnabled(false);
        m_jPriceBuy5.setEnabled(false);
        m_jPriceBuy6.setEnabled(false);
        m_jPriceBuy7.setEnabled(false);
        m_jPriceBuy8.setEnabled(false);
        m_jPriceBuy9.setEnabled(false);
        m_jPriceBuy10.setEnabled(false);
        m_jPriceBuy11.setEnabled(false);
        m_jPriceBuy12.setEnabled(false);
        m_jPriceBuy13.setEnabled(false);
        m_jPriceBuy14.setEnabled(false);
        m_jPriceBuy15.setEnabled(false);
        m_jPriceBuy16.setEnabled(false);
        m_jPriceBuy17.setEnabled(false);
        m_jPriceBuy18.setEnabled(false);
        m_jPriceBuy19.setEnabled(false);
        m_jPriceBuy20.setEnabled(false);
        m_jPriceBuy21.setEnabled(false);
        m_jPriceBuy22.setEnabled(false);
        m_jPriceBuy1S.setEnabled(false);
        m_jPriceBuy2S.setEnabled(false);
        m_jPriceBuy3S.setEnabled(false);
        m_jPriceBuy4S.setEnabled(false);
        m_jPriceBuy5S.setEnabled(false);
        m_jPriceBuy6S.setEnabled(false);
        m_jPriceBuy7S.setEnabled(false);
        m_jPriceBuy8S.setEnabled(false);
        m_jPriceBuy9S.setEnabled(false);
        m_jPriceBuy10S.setEnabled(false);
        m_jPriceBuy11S.setEnabled(false);
        m_jPriceBuy12S.setEnabled(false);
        m_jPriceBuy13S.setEnabled(false);
        m_jPriceBuy14S.setEnabled(false);
        m_jPriceBuy15S.setEnabled(false);
        m_jPriceBuy16S.setEnabled(false);
        m_jPriceBuy17S.setEnabled(false);
        m_jPriceBuy18S.setEnabled(false);
        m_jPriceBuy19S.setEnabled(false);
        m_jPriceBuy20S.setEnabled(false);
        m_jPriceBuy21S.setEnabled(false);
        m_jPriceBuy22S.setEnabled(false);
        
        m_jPriceSellTax.setEnabled(false);
        m_jmargin.setEnabled(false);
        m_jImage.setEnabled(false);
        m_jstockcost.setEnabled(false);
        m_jstockvolume.setEnabled(false);
        m_jInCatalog.setEnabled(false);
        m_jCatalogOrder.setEnabled(false);
        txtAttributes.setEnabled(false);
        
    }
    public void writeValueInsert() {
       
        reportlock = true;
        // Los valores
        m_jTitle.setText(AppLocal.getIntString("label.recordnew"));
        m_id = UUID.randomUUID().toString();
        m_jRef.setText(null);
        m_jCode.setText(null);
        m_jName.setText(null);
        m_jComment.setSelected(false);
        m_jScale.setSelected(false);
        m_CategoryModel.setSelectedKey(null);
        taxcatmodel.setSelectedKey(null);
        attmodel.setSelectedKey(null);
        m_jPriceSell.setText("0.00");
        m_jPriceSell1.setText("0.00");
        m_jPriceSell2.setText("0.00");
        m_jPriceSell3.setText("0.00");
        m_jPriceSell4.setText("0.00");
        m_jPriceSell5.setText("0.00");
        m_jPriceSell6.setText("0.00");
        m_jPriceSell7.setText("0.00");
        m_jPriceSell8.setText("0.00");
        m_jPriceSell9.setText("0.00");
        m_jPriceSell10.setText("0.00");
        m_jPriceSell11.setText("0.00");
        m_jPriceSell12.setText("0.00");
        m_jPriceSell13.setText("0.00");
        m_jPriceSell14.setText("0.00");
        m_jPriceSell15.setText("0.00");
        m_jPriceSell16.setText("0.00");
        m_jPriceSell17.setText("0.00");
        m_jPriceSell18.setText("0.00");
        m_jPriceSell19.setText("0.00");
        m_jPriceSell20.setText("0.00");
        m_jPriceSell21.setText("0.00");  
        m_jPriceSell22.setText("0.00");
        m_jPriceSell23.setText("0.00");
        m_jPriceSell24.setText("0.00");
        m_jPriceSell25.setText("0.00");
        m_jPriceSell26.setText("0.00");
        m_jPriceSell27.setText("0.00");
        m_jPriceSell28.setText("0.00");
        m_jPriceSell29.setText("0.00");
        m_jPriceSell30.setText("0.00");
        m_jPriceSell31.setText("0.00");
        m_jPriceSell32.setText("0.00");
        m_jPriceSell34.setText("0.00");
        m_jPriceSell35.setText("0.00");
        m_jPriceSell36.setText("0.00");
        m_jPriceSell37.setText("0.00");
        m_jPriceSell38.setText("0.00");
        m_jPriceSell39.setText("0.00");
        m_jPriceSell40.setText("0.00");
        m_jPriceSell41.setText("0.00");
        m_jPriceSell42.setText("0.00");
        m_jPriceSell43.setText("0.00");
        
        m_jPriceBuy.setText("0.00");
        m_jPriceBuy1.setText("0.00");
        m_jPriceBuy2.setText("0.00");
        m_jPriceBuy3.setText("0.00");
        m_jPriceBuy4.setText("0.00");
        m_jPriceBuy5.setText("0.00");
        m_jPriceBuy6.setText("0.00");
        m_jPriceBuy7.setText("0.00");
        m_jPriceBuy8.setText("0.00");
        m_jPriceBuy9.setText("0.00");
        m_jPriceBuy10.setText("0.00");
        m_jPriceBuy11.setText("0.00");
        m_jPriceBuy12.setText("0.00");
        m_jPriceBuy13.setText("0.00");
        m_jPriceBuy14.setText("0.00");
        m_jPriceBuy15.setText("0.00");
        m_jPriceBuy16.setText("0.00");
        m_jPriceBuy17.setText("0.00");
        m_jPriceBuy18.setText("0.00");
        m_jPriceBuy19.setText("0.00");
        m_jPriceBuy20.setText("0.00");
        m_jPriceBuy21.setText("0.00");
        m_jPriceBuy22.setText("0.00");
        m_jPriceBuy1S.setText("0.00");
        m_jPriceBuy2S.setText("0.00");
        m_jPriceBuy3S.setText("0.00");
        m_jPriceBuy4S.setText("0.00");
        m_jPriceBuy5S.setText("0.00");
        m_jPriceBuy6S.setText("0.00");
        m_jPriceBuy7S.setText("0.00");
        m_jPriceBuy8S.setText("0.00");
        m_jPriceBuy9S.setText("0.00");
        m_jPriceBuy10S.setText("0.00");
        m_jPriceBuy11S.setText("0.00");
        m_jPriceBuy12S.setText("0.00");
        m_jPriceBuy13S.setText("0.00");
        m_jPriceBuy14S.setText("0.00");
        m_jPriceBuy15S.setText("0.00");
        m_jPriceBuy16S.setText("0.00");
        m_jPriceBuy17S.setText("0.00");
        m_jPriceBuy18S.setText("0.00");
        m_jPriceBuy19S.setText("0.00");
        m_jPriceBuy20S.setText("0.00");
        m_jPriceBuy21S.setText("0.00");
        m_jPriceBuy22S.setText("0.00");
        
        
        m_jImage.setImage(null);
        m_jstockcost.setText(null);
        m_jstockvolume.setText(null);
        m_jInCatalog.setSelected(true);
        m_jCatalogOrder.setText(null);
        txtAttributes.setText(null);
        reportlock = false;
        // Los habilitados
        m_jRef.setEnabled(true);
        m_jCode.setEnabled(true);
        m_jName.setEnabled(true);
        m_jComment.setEnabled(true);
        m_jScale.setEnabled(true);
        m_jCategory.setEnabled(true);
        m_jTax.setEnabled(true);
        m_jAtt.setEnabled(true);
        m_jPriceBuy.setEnabled(true);
        
        m_jPriceSell.setEnabled(true); 
        m_jPriceSell1.setEnabled(true);
        m_jPriceSell2.setEnabled(true);
        m_jPriceSell3.setEnabled(true);
        m_jPriceSell4.setEnabled(true);
        m_jPriceSell5.setEnabled(true);
        m_jPriceSell6.setEnabled(true);
        m_jPriceSell7.setEnabled(true);
        m_jPriceSell8.setEnabled(true);
        m_jPriceSell9.setEnabled(true);
        m_jPriceSell10.setEnabled(true);
        m_jPriceSell11.setEnabled(true);
        m_jPriceSell12.setEnabled(true);
        m_jPriceSell13.setEnabled(true);
        m_jPriceSell14.setEnabled(true);
        m_jPriceSell15.setEnabled(true);
        m_jPriceSell16.setEnabled(true);
        m_jPriceSell17.setEnabled(true);
        m_jPriceSell18.setEnabled(true);
        m_jPriceSell19.setEnabled(true);
        m_jPriceSell20.setEnabled(true);
        m_jPriceSell21.setEnabled(true);
        m_jPriceSell22.setEnabled(true);
        m_jPriceSell23.setEnabled(true);
        m_jPriceSell24.setEnabled(true);
        m_jPriceSell25.setEnabled(true);
        m_jPriceSell26.setEnabled(true);
        m_jPriceSell27.setEnabled(true);
        m_jPriceSell28.setEnabled(true);
        m_jPriceSell29.setEnabled(true);
        m_jPriceSell30.setEnabled(true);
        m_jPriceSell31.setEnabled(true);
        m_jPriceSell32.setEnabled(true);
        m_jPriceSell33.setEnabled(true);
        m_jPriceSell34.setEnabled(true);
        m_jPriceSell35.setEnabled(true);
        m_jPriceSell36.setEnabled(true);
        m_jPriceSell37.setEnabled(true);
        m_jPriceSell38.setEnabled(true);
        m_jPriceSell39.setEnabled(true);
        m_jPriceSell40.setEnabled(true);
        m_jPriceSell41.setEnabled(true);
        m_jPriceSell42.setEnabled(true);
        m_jPriceSell43.setEnabled(true);
        
        
        m_jPriceBuy1.setEnabled(true);
        m_jPriceBuy2.setEnabled(true);
        m_jPriceBuy3.setEnabled(true);
        m_jPriceBuy4.setEnabled(true);
        m_jPriceBuy5.setEnabled(true);
        m_jPriceBuy6.setEnabled(true);
        m_jPriceBuy7.setEnabled(true);
        m_jPriceBuy8.setEnabled(true);
        m_jPriceBuy9.setEnabled(true);
        m_jPriceBuy10.setEnabled(true);
        m_jPriceBuy11.setEnabled(true);
        m_jPriceBuy12.setEnabled(true);
        m_jPriceBuy13.setEnabled(true);
        m_jPriceBuy14.setEnabled(true);
        m_jPriceBuy15.setEnabled(true);
        m_jPriceBuy16.setEnabled(true);
        m_jPriceBuy17.setEnabled(true);
        m_jPriceBuy18.setEnabled(true);
        m_jPriceBuy19.setEnabled(true);
        m_jPriceBuy20.setEnabled(true);
        m_jPriceBuy21.setEnabled(true);
        m_jPriceBuy22.setEnabled(true);
        m_jPriceBuy1S.setEnabled(true);
        m_jPriceBuy2S.setEnabled(true);
        m_jPriceBuy3S.setEnabled(true);
        m_jPriceBuy4S.setEnabled(true);
        m_jPriceBuy5S.setEnabled(true);
        m_jPriceBuy6S.setEnabled(true);
        m_jPriceBuy7S.setEnabled(true);
        m_jPriceBuy8S.setEnabled(true);
        m_jPriceBuy9S.setEnabled(true);
        m_jPriceBuy10S.setEnabled(true);
        m_jPriceBuy11S.setEnabled(true);
        m_jPriceBuy12S.setEnabled(true);
        m_jPriceBuy13S.setEnabled(true);
        m_jPriceBuy14S.setEnabled(true);
        m_jPriceBuy15S.setEnabled(true);
        m_jPriceBuy16S.setEnabled(true);
        m_jPriceBuy17S.setEnabled(true);
        m_jPriceBuy18S.setEnabled(true);
        m_jPriceBuy19S.setEnabled(true);
        m_jPriceBuy20S.setEnabled(true);
        m_jPriceBuy21S.setEnabled(true);
        m_jPriceBuy22S.setEnabled(true);
        
        m_jPriceSellTax.setEnabled(true);
        m_jmargin.setEnabled(true);
        m_jImage.setEnabled(true);
        m_jstockcost.setEnabled(true);
        m_jstockvolume.setEnabled(true);
        m_jInCatalog.setEnabled(true); 
        m_jCatalogOrder.setEnabled(false);
        txtAttributes.setEnabled(true);
    }
    public void writeValueDelete(Object value) {
        
        reportlock = true;       
        Object[] myprod = (Object[]) value;
        m_jTitle.setText(Formats.STRING.formatValue(myprod[1]) + " - " + Formats.STRING.formatValue(myprod[3]) + " " + AppLocal.getIntString("label.recorddeleted"));
        m_id = myprod[0];
        m_jRef.setText(Formats.STRING.formatValue(myprod[1]));
        m_jCode.setText(Formats.STRING.formatValue(myprod[2]));
        m_jName.setText(Formats.STRING.formatValue(myprod[3]));
        m_jComment.setSelected(((Boolean)myprod[4]).booleanValue());
        m_jScale.setSelected(((Boolean)myprod[5]).booleanValue());
        m_jPriceBuy.setText(Formats.CURRENCY.formatValue(myprod[6]));
        m_jPriceSell.setText(Formats.CURRENCY.formatValue(myprod[7]));
        m_CategoryModel.setSelectedKey(myprod[8]);
        taxcatmodel.setSelectedKey(myprod[9]);
        attmodel.setSelectedKey(myprod[10]);
        m_jImage.setImage((BufferedImage) myprod[11]);
        m_jstockcost.setText(Formats.CURRENCY.formatValue(myprod[12]));
        m_jstockvolume.setText(Formats.DOUBLE.formatValue(myprod[13]));
        m_jInCatalog.setSelected(((Boolean)myprod[14]).booleanValue());
        m_jCatalogOrder.setText(Formats.INT.formatValue(myprod[15]));
        txtAttributes.setText(Formats.BYTEA.formatValue(myprod[16]));
        m_jPriceSell1.setText(Formats.CURRENCY.formatValue(myprod[17]));
        m_jPriceSell2.setText(Formats.CURRENCY.formatValue(myprod[18]));
        m_jPriceSell3.setText(Formats.CURRENCY.formatValue(myprod[19]));
        m_jPriceSell4.setText(Formats.CURRENCY.formatValue(myprod[20]));
        m_jPriceSell5.setText(Formats.CURRENCY.formatValue(myprod[21]));
        m_jPriceSell6.setText(Formats.CURRENCY.formatValue(myprod[22]));
        m_jPriceSell7.setText(Formats.CURRENCY.formatValue(myprod[23]));
        m_jPriceSell8.setText(Formats.CURRENCY.formatValue(myprod[24]));
        m_jPriceSell9.setText(Formats.CURRENCY.formatValue(myprod[25]));
        m_jPriceSell10.setText(Formats.CURRENCY.formatValue(myprod[26]));
        m_jPriceSell11.setText(Formats.CURRENCY.formatValue(myprod[27]));
        m_jPriceSell12.setText(Formats.CURRENCY.formatValue(myprod[28]));
        m_jPriceSell13.setText(Formats.CURRENCY.formatValue(myprod[29]));
        m_jPriceSell14.setText(Formats.CURRENCY.formatValue(myprod[30]));
        m_jPriceSell15.setText(Formats.CURRENCY.formatValue(myprod[31]));
        m_jPriceSell16.setText(Formats.CURRENCY.formatValue(myprod[32]));
        m_jPriceSell17.setText(Formats.CURRENCY.formatValue(myprod[33]));
        m_jPriceSell18.setText(Formats.CURRENCY.formatValue(myprod[34]));
        m_jPriceSell19.setText(Formats.CURRENCY.formatValue(myprod[35]));
        m_jPriceSell20.setText(Formats.CURRENCY.formatValue(myprod[36]));
        m_jPriceSell21.setText(Formats.CURRENCY.formatValue(myprod[37]));
        m_jPriceSell22.setText(Formats.CURRENCY.formatValue(myprod[38]));
        m_jPriceSell23.setText(Formats.CURRENCY.formatValue(myprod[39]));
        m_jPriceSell24.setText(Formats.CURRENCY.formatValue(myprod[40]));
        m_jPriceSell25.setText(Formats.CURRENCY.formatValue(myprod[41]));
        m_jPriceSell26.setText(Formats.CURRENCY.formatValue(myprod[42]));
        m_jPriceSell27.setText(Formats.CURRENCY.formatValue(myprod[43]));
        m_jPriceSell28.setText(Formats.CURRENCY.formatValue(myprod[44]));
        m_jPriceSell29.setText(Formats.CURRENCY.formatValue(myprod[45]));
        m_jPriceSell30.setText(Formats.CURRENCY.formatValue(myprod[46]));
        m_jPriceSell31.setText(Formats.CURRENCY.formatValue(myprod[47]));
        m_jPriceSell32.setText(Formats.CURRENCY.formatValue(myprod[48]));
        m_jPriceSell33.setText(Formats.CURRENCY.formatValue(myprod[49]));
        m_jPriceSell34.setText(Formats.CURRENCY.formatValue(myprod[50]));
        m_jPriceSell35.setText(Formats.CURRENCY.formatValue(myprod[51]));
        m_jPriceSell36.setText(Formats.CURRENCY.formatValue(myprod[52]));
        m_jPriceSell37.setText(Formats.CURRENCY.formatValue(myprod[53]));
        m_jPriceSell38.setText(Formats.CURRENCY.formatValue(myprod[54]));
        m_jPriceSell39.setText(Formats.CURRENCY.formatValue(myprod[55]));
        m_jPriceSell40.setText(Formats.CURRENCY.formatValue(myprod[56]));
        m_jPriceSell41.setText(Formats.CURRENCY.formatValue(myprod[57]));
        m_jPriceSell42.setText(Formats.CURRENCY.formatValue(myprod[58]));
        m_jPriceSell43.setText(Formats.CURRENCY.formatValue(myprod[59]));
        
        m_jPriceBuy1.setText(Formats.CURRENCY.formatValue(myprod[60]));
        m_jPriceBuy2.setText(Formats.CURRENCY.formatValue(myprod[61]));
        m_jPriceBuy3.setText(Formats.CURRENCY.formatValue(myprod[62]));
        m_jPriceBuy4.setText(Formats.CURRENCY.formatValue(myprod[63]));
        m_jPriceBuy5.setText(Formats.CURRENCY.formatValue(myprod[64]));
        m_jPriceBuy6.setText(Formats.CURRENCY.formatValue(myprod[65]));
        m_jPriceBuy7.setText(Formats.CURRENCY.formatValue(myprod[66]));
        m_jPriceBuy8.setText(Formats.CURRENCY.formatValue(myprod[67]));
        m_jPriceBuy9.setText(Formats.CURRENCY.formatValue(myprod[68]));
        m_jPriceBuy10.setText(Formats.CURRENCY.formatValue(myprod[69]));
        m_jPriceBuy11.setText(Formats.CURRENCY.formatValue(myprod[70]));
        m_jPriceBuy12.setText(Formats.CURRENCY.formatValue(myprod[71]));
        m_jPriceBuy13.setText(Formats.CURRENCY.formatValue(myprod[72]));
        m_jPriceBuy14.setText(Formats.CURRENCY.formatValue(myprod[73]));
        m_jPriceBuy15.setText(Formats.CURRENCY.formatValue(myprod[74]));
        m_jPriceBuy16.setText(Formats.CURRENCY.formatValue(myprod[75]));
        m_jPriceBuy17.setText(Formats.CURRENCY.formatValue(myprod[76]));
        m_jPriceBuy18.setText(Formats.CURRENCY.formatValue(myprod[77]));
        m_jPriceBuy19.setText(Formats.CURRENCY.formatValue(myprod[78]));
        m_jPriceBuy20.setText(Formats.CURRENCY.formatValue(myprod[79]));
        m_jPriceBuy21.setText(Formats.CURRENCY.formatValue(myprod[80]));
        m_jPriceBuy22.setText(Formats.CURRENCY.formatValue(myprod[81]));
        m_jPriceBuy1S.setText(Formats.CURRENCY.formatValue(myprod[82]));
        m_jPriceBuy2S.setText(Formats.CURRENCY.formatValue(myprod[83]));
        m_jPriceBuy3S.setText(Formats.CURRENCY.formatValue(myprod[84]));
        m_jPriceBuy4S.setText(Formats.CURRENCY.formatValue(myprod[85]));
        m_jPriceBuy5S.setText(Formats.CURRENCY.formatValue(myprod[86]));
        m_jPriceBuy6S.setText(Formats.CURRENCY.formatValue(myprod[87]));
        m_jPriceBuy7S.setText(Formats.CURRENCY.formatValue(myprod[88]));
        m_jPriceBuy8S.setText(Formats.CURRENCY.formatValue(myprod[89]));
        m_jPriceBuy9S.setText(Formats.CURRENCY.formatValue(myprod[90]));
        m_jPriceBuy10S.setText(Formats.CURRENCY.formatValue(myprod[91]));
        m_jPriceBuy11S.setText(Formats.CURRENCY.formatValue(myprod[92]));
        m_jPriceBuy12S.setText(Formats.CURRENCY.formatValue(myprod[93]));
        m_jPriceBuy13S.setText(Formats.CURRENCY.formatValue(myprod[94]));
        m_jPriceBuy14S.setText(Formats.CURRENCY.formatValue(myprod[95]));
        m_jPriceBuy15S.setText(Formats.CURRENCY.formatValue(myprod[96]));
        m_jPriceBuy16S.setText(Formats.CURRENCY.formatValue(myprod[97]));
        m_jPriceBuy17S.setText(Formats.CURRENCY.formatValue(myprod[98]));
        m_jPriceBuy18S.setText(Formats.CURRENCY.formatValue(myprod[99]));
        m_jPriceBuy19S.setText(Formats.CURRENCY.formatValue(myprod[100]));
        m_jPriceBuy20S.setText(Formats.CURRENCY.formatValue(myprod[101]));
        m_jPriceBuy21S.setText(Formats.CURRENCY.formatValue(myprod[102]));
        m_jPriceBuy22S.setText(Formats.CURRENCY.formatValue(myprod[103]));
        txtAttributes.setCaretPosition(0);
        reportlock = false;
        
        // Los habilitados
        m_jRef.setEnabled(false);
        m_jCode.setEnabled(false);
        m_jName.setEnabled(false);
        m_jComment.setEnabled(false);
        m_jScale.setEnabled(false);
        m_jCategory.setEnabled(false);
        m_jTax.setEnabled(false);
        m_jAtt.setEnabled(false);
        m_jPriceBuy.setEnabled(false);
        m_jPriceSell.setEnabled(false);
        m_jPriceSellTax.setEnabled(false);
        m_jmargin.setEnabled(false);
        m_jImage.setEnabled(false);
        m_jstockcost.setEnabled(false);
        m_jstockvolume.setEnabled(false);
        m_jInCatalog.setEnabled(false);
        m_jCatalogOrder.setEnabled(false);
        txtAttributes.setEnabled(false);
        
        m_jPriceSell.setEnabled(false); 
        m_jPriceSell1.setEnabled(false);
        m_jPriceSell2.setEnabled(false);
        m_jPriceSell3.setEnabled(false);
        m_jPriceSell4.setEnabled(false);
        m_jPriceSell5.setEnabled(false);
        m_jPriceSell6.setEnabled(false);
        m_jPriceSell7.setEnabled(false);
        m_jPriceSell8.setEnabled(false);
        m_jPriceSell9.setEnabled(false);
        m_jPriceSell10.setEnabled(false);
        m_jPriceSell11.setEnabled(false);
        m_jPriceSell12.setEnabled(false);
        m_jPriceSell13.setEnabled(false);
        m_jPriceSell14.setEnabled(false);
        m_jPriceSell15.setEnabled(false);
        m_jPriceSell16.setEnabled(false);
        m_jPriceSell17.setEnabled(false);
        m_jPriceSell18.setEnabled(false);
        m_jPriceSell19.setEnabled(false);
        m_jPriceSell20.setEnabled(false);
        m_jPriceSell21.setEnabled(false);
        m_jPriceSell22.setEnabled(false);
        m_jPriceSell23.setEnabled(false);
        m_jPriceSell24.setEnabled(false);
        m_jPriceSell25.setEnabled(false);
        m_jPriceSell26.setEnabled(false);
        m_jPriceSell27.setEnabled(false);
        m_jPriceSell28.setEnabled(false);
        m_jPriceSell29.setEnabled(false);
        m_jPriceSell30.setEnabled(false);
        m_jPriceSell31.setEnabled(false);
        m_jPriceSell32.setEnabled(false);
        m_jPriceSell33.setEnabled(false);
        m_jPriceSell34.setEnabled(false);
        m_jPriceSell35.setEnabled(false);
        m_jPriceSell36.setEnabled(false);
        m_jPriceSell37.setEnabled(false);
        m_jPriceSell38.setEnabled(false);
        m_jPriceSell39.setEnabled(false);
        m_jPriceSell40.setEnabled(false);
        m_jPriceSell41.setEnabled(false);
        m_jPriceSell42.setEnabled(false);
        m_jPriceSell43.setEnabled(false);
        
        m_jPriceBuy1.setEnabled(false);
        m_jPriceBuy2.setEnabled(false);
        m_jPriceBuy3.setEnabled(false);
        m_jPriceBuy4.setEnabled(false);
        m_jPriceBuy5.setEnabled(false);
        m_jPriceBuy6.setEnabled(false);
        m_jPriceBuy7.setEnabled(false);
        m_jPriceBuy8.setEnabled(false);
        m_jPriceBuy9.setEnabled(false);
        m_jPriceBuy10.setEnabled(false);
        m_jPriceBuy11.setEnabled(false);
        m_jPriceBuy12.setEnabled(false);
        m_jPriceBuy13.setEnabled(false);
        m_jPriceBuy14.setEnabled(false);
        m_jPriceBuy15.setEnabled(false);
        m_jPriceBuy16.setEnabled(false);
        m_jPriceBuy17.setEnabled(false);
        m_jPriceBuy18.setEnabled(false);
        m_jPriceBuy19.setEnabled(false);
        m_jPriceBuy20.setEnabled(false);
        m_jPriceBuy21.setEnabled(false);
        m_jPriceBuy22.setEnabled(false);
        m_jPriceBuy1S.setEnabled(false);
        m_jPriceBuy2S.setEnabled(false);
        m_jPriceBuy3S.setEnabled(false);
        m_jPriceBuy4S.setEnabled(false);
        m_jPriceBuy5S.setEnabled(false);
        m_jPriceBuy6S.setEnabled(false);
        m_jPriceBuy7S.setEnabled(false);
        m_jPriceBuy8S.setEnabled(false);
        m_jPriceBuy9S.setEnabled(false);
        m_jPriceBuy10S.setEnabled(false);
        m_jPriceBuy11S.setEnabled(false);
        m_jPriceBuy12S.setEnabled(false);
        m_jPriceBuy13S.setEnabled(false);
        m_jPriceBuy14S.setEnabled(false);
        m_jPriceBuy15S.setEnabled(false);
        m_jPriceBuy16S.setEnabled(false);
        m_jPriceBuy17S.setEnabled(false);
        m_jPriceBuy18S.setEnabled(false);
        m_jPriceBuy19S.setEnabled(false);
        m_jPriceBuy20S.setEnabled(false);
        m_jPriceBuy21S.setEnabled(false);
        m_jPriceBuy22S.setEnabled(false);
    }    
    
    public void writeValueEdit(Object value) {
        
        reportlock = true;
        Object[] myprod = (Object[]) value;
        m_jTitle.setText(Formats.STRING.formatValue(myprod[1]) + " - " + Formats.STRING.formatValue(myprod[3]));
        m_id = myprod[0];
        m_jRef.setText(Formats.STRING.formatValue(myprod[1]));
        m_jCode.setText(Formats.STRING.formatValue(myprod[1]));
        m_jName.setText(Formats.STRING.formatValue(myprod[3]));
        m_jComment.setSelected(((Boolean)myprod[4]).booleanValue());
        m_jScale.setSelected(((Boolean)myprod[5]).booleanValue());
        m_jPriceBuy.setText(Formats.CURRENCY.formatValue(myprod[6]));
        m_jPriceSell.setText(Formats.CURRENCY.formatValue(myprod[7]));
        m_CategoryModel.setSelectedKey(myprod[8]);
        taxcatmodel.setSelectedKey(myprod[9]);
        attmodel.setSelectedKey(myprod[10]);
        m_jImage.setImage((BufferedImage) myprod[11]);
        m_jstockcost.setText(Formats.CURRENCY.formatValue(myprod[12]));
        m_jstockvolume.setText(Formats.DOUBLE.formatValue(myprod[13]));
        m_jInCatalog.setSelected(((Boolean)myprod[14]).booleanValue());
        m_jCatalogOrder.setText(Formats.INT.formatValue(myprod[15]));
        txtAttributes.setText(Formats.BYTEA.formatValue(myprod[16]));
        m_jPriceSell1.setText(Formats.CURRENCY.formatValue(myprod[17]));
        m_jPriceSell2.setText(Formats.CURRENCY.formatValue(myprod[18]));
        m_jPriceSell3.setText(Formats.CURRENCY.formatValue(myprod[19]));
        m_jPriceSell4.setText(Formats.CURRENCY.formatValue(myprod[20]));
        m_jPriceSell5.setText(Formats.CURRENCY.formatValue(myprod[21]));
        m_jPriceSell6.setText(Formats.CURRENCY.formatValue(myprod[22]));
        m_jPriceSell7.setText(Formats.CURRENCY.formatValue(myprod[23]));
        m_jPriceSell8.setText(Formats.CURRENCY.formatValue(myprod[24]));
        m_jPriceSell9.setText(Formats.CURRENCY.formatValue(myprod[25]));
        m_jPriceSell10.setText(Formats.CURRENCY.formatValue(myprod[26]));
        m_jPriceSell11.setText(Formats.CURRENCY.formatValue(myprod[27]));
        m_jPriceSell12.setText(Formats.CURRENCY.formatValue(myprod[28]));
        m_jPriceSell13.setText(Formats.CURRENCY.formatValue(myprod[29]));
        m_jPriceSell14.setText(Formats.CURRENCY.formatValue(myprod[30]));
        m_jPriceSell15.setText(Formats.CURRENCY.formatValue(myprod[31]));
        m_jPriceSell16.setText(Formats.CURRENCY.formatValue(myprod[32]));
        m_jPriceSell17.setText(Formats.CURRENCY.formatValue(myprod[33]));
        m_jPriceSell18.setText(Formats.CURRENCY.formatValue(myprod[34]));
        m_jPriceSell19.setText(Formats.CURRENCY.formatValue(myprod[35]));
        m_jPriceSell20.setText(Formats.CURRENCY.formatValue(myprod[36]));
        m_jPriceSell21.setText(Formats.CURRENCY.formatValue(myprod[37]));
        m_jPriceSell22.setText(Formats.CURRENCY.formatValue(myprod[38]));
        m_jPriceSell23.setText(Formats.CURRENCY.formatValue(myprod[39]));
        m_jPriceSell24.setText(Formats.CURRENCY.formatValue(myprod[40]));
        m_jPriceSell25.setText(Formats.CURRENCY.formatValue(myprod[41]));
        m_jPriceSell26.setText(Formats.CURRENCY.formatValue(myprod[42]));
        m_jPriceSell27.setText(Formats.CURRENCY.formatValue(myprod[43]));
        m_jPriceSell28.setText(Formats.CURRENCY.formatValue(myprod[44]));
        m_jPriceSell29.setText(Formats.CURRENCY.formatValue(myprod[45]));
        m_jPriceSell30.setText(Formats.CURRENCY.formatValue(myprod[46]));
        m_jPriceSell31.setText(Formats.CURRENCY.formatValue(myprod[47]));
        m_jPriceSell32.setText(Formats.CURRENCY.formatValue(myprod[48]));
        m_jPriceSell33.setText(Formats.CURRENCY.formatValue(myprod[49]));
        m_jPriceSell34.setText(Formats.CURRENCY.formatValue(myprod[50]));
        m_jPriceSell35.setText(Formats.CURRENCY.formatValue(myprod[51]));
        m_jPriceSell36.setText(Formats.CURRENCY.formatValue(myprod[52]));
        m_jPriceSell37.setText(Formats.CURRENCY.formatValue(myprod[53]));
        m_jPriceSell38.setText(Formats.CURRENCY.formatValue(myprod[54]));
        m_jPriceSell39.setText(Formats.CURRENCY.formatValue(myprod[55]));
        m_jPriceSell40.setText(Formats.CURRENCY.formatValue(myprod[56]));
        m_jPriceSell41.setText(Formats.CURRENCY.formatValue(myprod[57]));
        m_jPriceSell42.setText(Formats.CURRENCY.formatValue(myprod[58]));
        m_jPriceSell43.setText(Formats.CURRENCY.formatValue(myprod[59]));
        
        
        m_jPriceBuy1.setText(Formats.CURRENCY.formatValue(myprod[60]));
        m_jPriceBuy2.setText(Formats.CURRENCY.formatValue(myprod[61]));
        m_jPriceBuy3.setText(Formats.CURRENCY.formatValue(myprod[62]));
        m_jPriceBuy4.setText(Formats.CURRENCY.formatValue(myprod[63]));
        m_jPriceBuy5.setText(Formats.CURRENCY.formatValue(myprod[64]));
        m_jPriceBuy6.setText(Formats.CURRENCY.formatValue(myprod[65]));
        m_jPriceBuy7.setText(Formats.CURRENCY.formatValue(myprod[66]));
        m_jPriceBuy8.setText(Formats.CURRENCY.formatValue(myprod[67]));
        m_jPriceBuy9.setText(Formats.CURRENCY.formatValue(myprod[68]));
        m_jPriceBuy10.setText(Formats.CURRENCY.formatValue(myprod[69]));
        m_jPriceBuy11.setText(Formats.CURRENCY.formatValue(myprod[70]));
        m_jPriceBuy12.setText(Formats.CURRENCY.formatValue(myprod[71]));
        m_jPriceBuy13.setText(Formats.CURRENCY.formatValue(myprod[72]));
        m_jPriceBuy14.setText(Formats.CURRENCY.formatValue(myprod[73]));
        m_jPriceBuy15.setText(Formats.CURRENCY.formatValue(myprod[74]));
        m_jPriceBuy16.setText(Formats.CURRENCY.formatValue(myprod[75]));
        m_jPriceBuy17.setText(Formats.CURRENCY.formatValue(myprod[76]));
        m_jPriceBuy18.setText(Formats.CURRENCY.formatValue(myprod[77]));
        m_jPriceBuy19.setText(Formats.CURRENCY.formatValue(myprod[78]));
        m_jPriceBuy20.setText(Formats.CURRENCY.formatValue(myprod[79]));
        m_jPriceBuy21.setText(Formats.CURRENCY.formatValue(myprod[80]));
        m_jPriceBuy22.setText(Formats.CURRENCY.formatValue(myprod[81]));
        m_jPriceBuy1S.setText(Formats.CURRENCY.formatValue(myprod[82]));
        m_jPriceBuy2S.setText(Formats.CURRENCY.formatValue(myprod[83]));
        m_jPriceBuy3S.setText(Formats.CURRENCY.formatValue(myprod[84]));
        m_jPriceBuy4S.setText(Formats.CURRENCY.formatValue(myprod[85]));
        m_jPriceBuy5S.setText(Formats.CURRENCY.formatValue(myprod[86]));
        m_jPriceBuy6S.setText(Formats.CURRENCY.formatValue(myprod[87]));
        m_jPriceBuy7S.setText(Formats.CURRENCY.formatValue(myprod[88]));
        m_jPriceBuy8S.setText(Formats.CURRENCY.formatValue(myprod[89]));
        m_jPriceBuy9S.setText(Formats.CURRENCY.formatValue(myprod[90]));
        m_jPriceBuy10S.setText(Formats.CURRENCY.formatValue(myprod[91]));
        m_jPriceBuy11S.setText(Formats.CURRENCY.formatValue(myprod[92]));
        m_jPriceBuy12S.setText(Formats.CURRENCY.formatValue(myprod[93]));
        m_jPriceBuy13S.setText(Formats.CURRENCY.formatValue(myprod[94]));
        m_jPriceBuy14S.setText(Formats.CURRENCY.formatValue(myprod[95]));
        m_jPriceBuy15S.setText(Formats.CURRENCY.formatValue(myprod[96]));
        m_jPriceBuy16S.setText(Formats.CURRENCY.formatValue(myprod[97]));
        m_jPriceBuy17S.setText(Formats.CURRENCY.formatValue(myprod[98]));
        m_jPriceBuy18S.setText(Formats.CURRENCY.formatValue(myprod[99]));
        m_jPriceBuy19S.setText(Formats.CURRENCY.formatValue(myprod[100]));
        m_jPriceBuy20S.setText(Formats.CURRENCY.formatValue(myprod[101]));
        m_jPriceBuy21S.setText(Formats.CURRENCY.formatValue(myprod[102]));
        m_jPriceBuy22S.setText(Formats.CURRENCY.formatValue(myprod[103]));
        
        txtAttributes.setCaretPosition(0);
        reportlock = false;
        
        // Los habilitados
        m_jRef.setEnabled(true);
        m_jCode.setEnabled(true);
        m_jName.setEnabled(true);
        m_jComment.setEnabled(true);
        m_jScale.setEnabled(true);
        m_jCategory.setEnabled(true);
        m_jTax.setEnabled(true);
        m_jAtt.setEnabled(true);
        m_jPriceBuy.setEnabled(true);
        m_jPriceSell.setEnabled(true); 
        m_jPriceSellTax.setEnabled(true);
        m_jmargin.setEnabled(true);
        m_jImage.setEnabled(true);
        m_jstockcost.setEnabled(true);
        m_jstockvolume.setEnabled(true);
        m_jInCatalog.setEnabled(true);
        m_jCatalogOrder.setEnabled(m_jInCatalog.isSelected());  
        txtAttributes.setEnabled(true);
        m_jPriceSell.setEnabled(true); 
        m_jPriceSell1.setEnabled(true);
        m_jPriceSell2.setEnabled(true);
        m_jPriceSell3.setEnabled(true);
        m_jPriceSell4.setEnabled(true);
        m_jPriceSell5.setEnabled(true);
        m_jPriceSell6.setEnabled(true);
        m_jPriceSell7.setEnabled(true);
        m_jPriceSell8.setEnabled(true);
        m_jPriceSell9.setEnabled(true);
        m_jPriceSell10.setEnabled(true);
        m_jPriceSell11.setEnabled(true);
        m_jPriceSell12.setEnabled(true);
        m_jPriceSell13.setEnabled(true);
        m_jPriceSell14.setEnabled(true);
        m_jPriceSell15.setEnabled(true);
        m_jPriceSell16.setEnabled(true);
        m_jPriceSell17.setEnabled(true);
        m_jPriceSell18.setEnabled(true);
        m_jPriceSell19.setEnabled(true);
        m_jPriceSell20.setEnabled(true);
        m_jPriceSell21.setEnabled(true);
        m_jPriceSell22.setEnabled(true);
        m_jPriceSell23.setEnabled(true);
        m_jPriceSell24.setEnabled(true);
        m_jPriceSell25.setEnabled(true);
        m_jPriceSell26.setEnabled(true);
        m_jPriceSell27.setEnabled(true);
        m_jPriceSell28.setEnabled(true);
        m_jPriceSell29.setEnabled(true);
        m_jPriceSell30.setEnabled(true);
        m_jPriceSell31.setEnabled(true);
        m_jPriceSell32.setEnabled(true);
        m_jPriceSell33.setEnabled(true);
        m_jPriceSell34.setEnabled(true);
        m_jPriceSell35.setEnabled(true);
        m_jPriceSell36.setEnabled(true);
        m_jPriceSell37.setEnabled(true);
        m_jPriceSell38.setEnabled(true);
        m_jPriceSell39.setEnabled(true);
        m_jPriceSell40.setEnabled(true);
        m_jPriceSell41.setEnabled(true);
        m_jPriceSell42.setEnabled(true);
        m_jPriceSell43.setEnabled(true);
        
        m_jPriceBuy1.setEnabled(true);
        m_jPriceBuy2.setEnabled(true);
        m_jPriceBuy3.setEnabled(true);
        m_jPriceBuy4.setEnabled(true);
        m_jPriceBuy5.setEnabled(true);
        m_jPriceBuy6.setEnabled(true);
        m_jPriceBuy7.setEnabled(true);
        m_jPriceBuy8.setEnabled(true);
        m_jPriceBuy9.setEnabled(true);
        m_jPriceBuy10.setEnabled(true);
        m_jPriceBuy11.setEnabled(true);
        m_jPriceBuy12.setEnabled(true);
        m_jPriceBuy13.setEnabled(true);
        m_jPriceBuy14.setEnabled(true);
        m_jPriceBuy15.setEnabled(true);
        m_jPriceBuy16.setEnabled(true);
        m_jPriceBuy17.setEnabled(true);
        m_jPriceBuy18.setEnabled(true);
        m_jPriceBuy19.setEnabled(true);
        m_jPriceBuy20.setEnabled(true);
        m_jPriceBuy21.setEnabled(true);
        m_jPriceBuy22.setEnabled(true);
        m_jPriceBuy1S.setEnabled(true);
        m_jPriceBuy2S.setEnabled(true);
        m_jPriceBuy3S.setEnabled(true);
        m_jPriceBuy4S.setEnabled(true);
        m_jPriceBuy5S.setEnabled(true);
        m_jPriceBuy6S.setEnabled(true);
        m_jPriceBuy7S.setEnabled(true);
        m_jPriceBuy8S.setEnabled(true);
        m_jPriceBuy9S.setEnabled(true);
        m_jPriceBuy10S.setEnabled(true);
        m_jPriceBuy11S.setEnabled(true);
        m_jPriceBuy12S.setEnabled(true);
        m_jPriceBuy13S.setEnabled(true);
        m_jPriceBuy14S.setEnabled(true);
        m_jPriceBuy15S.setEnabled(true);
        m_jPriceBuy16S.setEnabled(true);
        m_jPriceBuy17S.setEnabled(true);
        m_jPriceBuy18S.setEnabled(true);
        m_jPriceBuy19S.setEnabled(true);
        m_jPriceBuy20S.setEnabled(true);
        m_jPriceBuy21S.setEnabled(true);
        m_jPriceBuy22S.setEnabled(true);
    }

    public Object createValue() throws BasicException {
        /*if(m_jPriceSell.getText()=="")
            m_jPriceSell.setText("0.00");
        if(m_jPriceSell1.getText()=="")
            m_jPriceSell1.setText("0.00");
        if(m_jPriceSell2.getText()=="")
            m_jPriceSell2.setText("0.00");
        if(m_jPriceSell3.getText()=="")
            m_jPriceSell3.setText("0.00");
        if(m_jPriceSell4.getText()=="")
            m_jPriceSell4.setText("0.00");
        if(m_jPriceSell5.getText()=="")
            m_jPriceSell5.setText("0.00");
        if(m_jPriceSell6.getText()=="")
            m_jPriceSell6.setText("0.00");
        if(m_jPriceSell7.getText()=="")
            m_jPriceSell7.setText("0.00");
        if(m_jPriceSell8.getText()=="")
            m_jPriceSell8.setText("0.00");
        if(m_jPriceSell9.getText()=="")
            m_jPriceSell9.setText("0.00");
        if(m_jPriceSell10.getText()=="")
            m_jPriceSell10.setText("0.00");
        if(m_jPriceSell11.getText()=="")
            m_jPriceSell11.setText("0.00");
        if(m_jPriceSell12.getText()=="")
            m_jPriceSell12.setText("0.00");
        if(m_jPriceSell13.getText()=="")
            m_jPriceSell13.setText("0.00");
        if(m_jPriceSell14.getText()=="")
            m_jPriceSell14.setText("0.00");
        if(m_jPriceSell15.getText()=="")
            m_jPriceSell15.setText("0.00");
        if(m_jPriceSell16.getText()=="")
            m_jPriceSell16.setText("0.00");
        if(m_jPriceSell17.getText()=="")
            m_jPriceSell17.setText("0.00");
        if(m_jPriceSell18.getText()=="")
            m_jPriceSell18.setText("0.00");
        if(m_jPriceSell19.getText()=="")
            m_jPriceSell19.setText("0.00");
        if(m_jPriceSell20.getText()=="")
            m_jPriceSell20.setText("0.00");
        if(m_jPriceSell21.getText()=="")
            m_jPriceSell21.setText("0.00");*/
        
        Object[] myprod = new Object[104];
        myprod[0] = m_id;
        myprod[1] = m_jRef.getText();
        myprod[2] = m_jRef.getText();
        myprod[3] = m_jName.getText();
        myprod[4] = Boolean.valueOf(m_jComment.isSelected());
        myprod[5] = Boolean.valueOf(m_jScale.isSelected());
        myprod[6] = Formats.CURRENCY.parseValue(m_jPriceBuy.getText());
        myprod[7] = Formats.CURRENCY.parseValue(m_jPriceSell.getText());
        myprod[8] = m_CategoryModel.getSelectedKey();
        myprod[9] = "000";
        myprod[10] = attmodel.getSelectedKey();
        myprod[11] = m_jImage.getImage();
        myprod[12] = Formats.CURRENCY.parseValue(m_jstockcost.getText());
        myprod[13] = Formats.DOUBLE.parseValue(m_jstockvolume.getText());
        myprod[14] = Boolean.valueOf(m_jInCatalog.isSelected());
        myprod[15] = Formats.INT.parseValue(m_jCatalogOrder.getText());
        myprod[16] = Formats.BYTEA.parseValue(txtAttributes.getText());
        myprod[17] = Formats.CURRENCY.parseValue(m_jPriceSell1.getText());
        myprod[18] = Formats.CURRENCY.parseValue(m_jPriceSell2.getText());
        myprod[19] = Formats.CURRENCY.parseValue(m_jPriceSell3.getText());
        myprod[20] = Formats.CURRENCY.parseValue(m_jPriceSell4.getText());
        myprod[21] = Formats.CURRENCY.parseValue(m_jPriceSell5.getText());
        myprod[22] = Formats.CURRENCY.parseValue(m_jPriceSell6.getText());
        myprod[23] = Formats.CURRENCY.parseValue(m_jPriceSell7.getText());
        myprod[24] = Formats.CURRENCY.parseValue(m_jPriceSell8.getText());
        myprod[25] = Formats.CURRENCY.parseValue(m_jPriceSell9.getText());
        myprod[26] = Formats.CURRENCY.parseValue(m_jPriceSell10.getText());
        myprod[27] = Formats.CURRENCY.parseValue(m_jPriceSell11.getText());
        myprod[28] = Formats.CURRENCY.parseValue(m_jPriceSell12.getText());
        myprod[29] = Formats.CURRENCY.parseValue(m_jPriceSell13.getText());
        myprod[30] = Formats.CURRENCY.parseValue(m_jPriceSell14.getText());
        myprod[31] = Formats.CURRENCY.parseValue(m_jPriceSell15.getText());
        myprod[32] = Formats.CURRENCY.parseValue(m_jPriceSell16.getText());
        myprod[33] = Formats.CURRENCY.parseValue(m_jPriceSell17.getText());
        myprod[34] = Formats.CURRENCY.parseValue(m_jPriceSell18.getText());
        myprod[35] = Formats.CURRENCY.parseValue(m_jPriceSell19.getText());
        myprod[36] = Formats.CURRENCY.parseValue(m_jPriceSell20.getText());
        myprod[37] = Formats.CURRENCY.parseValue(m_jPriceSell21.getText());
        myprod[38] = Formats.CURRENCY.parseValue(m_jPriceSell22.getText());
        myprod[39] = Formats.CURRENCY.parseValue(m_jPriceSell23.getText());
        myprod[40] = Formats.CURRENCY.parseValue(m_jPriceSell24.getText());
        myprod[41] = Formats.CURRENCY.parseValue(m_jPriceSell25.getText());
        myprod[42] = Formats.CURRENCY.parseValue(m_jPriceSell26.getText());
        myprod[43] = Formats.CURRENCY.parseValue(m_jPriceSell27.getText());
        myprod[44] = Formats.CURRENCY.parseValue(m_jPriceSell28.getText());
        myprod[45] = Formats.CURRENCY.parseValue(m_jPriceSell29.getText());
        myprod[46] = Formats.CURRENCY.parseValue(m_jPriceSell30.getText());
        myprod[47] = Formats.CURRENCY.parseValue(m_jPriceSell31.getText());
        myprod[48] = Formats.CURRENCY.parseValue(m_jPriceSell32.getText());
        myprod[49] = Formats.CURRENCY.parseValue(m_jPriceSell33.getText());
        myprod[50] = Formats.CURRENCY.parseValue(m_jPriceSell34.getText());
        myprod[51] = Formats.CURRENCY.parseValue(m_jPriceSell35.getText());
        myprod[52] = Formats.CURRENCY.parseValue(m_jPriceSell36.getText());
        myprod[53] = Formats.CURRENCY.parseValue(m_jPriceSell37.getText());
        myprod[54] = Formats.CURRENCY.parseValue(m_jPriceSell38.getText());
        myprod[55] = Formats.CURRENCY.parseValue(m_jPriceSell39.getText());
        myprod[56] = Formats.CURRENCY.parseValue(m_jPriceSell40.getText());
        myprod[57] = Formats.CURRENCY.parseValue(m_jPriceSell41.getText());
        myprod[58] = Formats.CURRENCY.parseValue(m_jPriceSell42.getText());
        myprod[59] = Formats.CURRENCY.parseValue(m_jPriceSell43.getText());
        
        myprod[60] = Formats.CURRENCY.parseValue(m_jPriceBuy1.getText());
        myprod[61] = Formats.CURRENCY.parseValue(m_jPriceBuy2.getText());
        myprod[62] = Formats.CURRENCY.parseValue(m_jPriceBuy3.getText());
        myprod[63] = Formats.CURRENCY.parseValue(m_jPriceBuy4.getText());
        myprod[64] = Formats.CURRENCY.parseValue(m_jPriceBuy5.getText());
        myprod[65] = Formats.CURRENCY.parseValue(m_jPriceBuy6.getText());
        myprod[66] = Formats.CURRENCY.parseValue(m_jPriceBuy7.getText());
        myprod[67] = Formats.CURRENCY.parseValue(m_jPriceBuy8.getText());
        myprod[68] = Formats.CURRENCY.parseValue(m_jPriceBuy9.getText());
        myprod[69] = Formats.CURRENCY.parseValue(m_jPriceBuy10.getText());
        myprod[70] = Formats.CURRENCY.parseValue(m_jPriceBuy11.getText());
        myprod[71] = Formats.CURRENCY.parseValue(m_jPriceBuy12.getText());
        myprod[72] = Formats.CURRENCY.parseValue(m_jPriceBuy13.getText());
        myprod[73] = Formats.CURRENCY.parseValue(m_jPriceBuy14.getText());
        myprod[74] = Formats.CURRENCY.parseValue(m_jPriceBuy15.getText());
        myprod[75] = Formats.CURRENCY.parseValue(m_jPriceBuy16.getText());
        myprod[76] = Formats.CURRENCY.parseValue(m_jPriceBuy17.getText());
        myprod[77] = Formats.CURRENCY.parseValue(m_jPriceBuy18.getText());
        myprod[78] = Formats.CURRENCY.parseValue(m_jPriceBuy19.getText());
        myprod[79] = Formats.CURRENCY.parseValue(m_jPriceBuy20.getText());
        myprod[80] = Formats.CURRENCY.parseValue(m_jPriceBuy21.getText());
        myprod[81] = Formats.CURRENCY.parseValue(m_jPriceBuy22.getText());
        myprod[82] = Formats.CURRENCY.parseValue(m_jPriceBuy1S.getText());
        myprod[83] = Formats.CURRENCY.parseValue(m_jPriceBuy2S.getText());
        myprod[84] = Formats.CURRENCY.parseValue(m_jPriceBuy3S.getText());
        myprod[85] = Formats.CURRENCY.parseValue(m_jPriceBuy4S.getText());
        myprod[86] = Formats.CURRENCY.parseValue(m_jPriceBuy5S.getText());
        myprod[87] = Formats.CURRENCY.parseValue(m_jPriceBuy6S.getText());
        myprod[88] = Formats.CURRENCY.parseValue(m_jPriceBuy7S.getText());
        myprod[89] = Formats.CURRENCY.parseValue(m_jPriceBuy8S.getText());
        myprod[90] = Formats.CURRENCY.parseValue(m_jPriceBuy9S.getText());
        myprod[91] = Formats.CURRENCY.parseValue(m_jPriceBuy10S.getText());
        myprod[92] = Formats.CURRENCY.parseValue(m_jPriceBuy11S.getText());
        myprod[93] = Formats.CURRENCY.parseValue(m_jPriceBuy12S.getText());
        myprod[94] = Formats.CURRENCY.parseValue(m_jPriceBuy13S.getText());
        myprod[95] = Formats.CURRENCY.parseValue(m_jPriceBuy14S.getText());
        myprod[96] = Formats.CURRENCY.parseValue(m_jPriceBuy15S.getText());
        myprod[97] = Formats.CURRENCY.parseValue(m_jPriceBuy16S.getText());
        myprod[98] = Formats.CURRENCY.parseValue(m_jPriceBuy17S.getText());
        myprod[99] = Formats.CURRENCY.parseValue(m_jPriceBuy18S.getText());
        myprod[100] = Formats.CURRENCY.parseValue(m_jPriceBuy19S.getText());
        myprod[101] = Formats.CURRENCY.parseValue(m_jPriceBuy20S.getText());
        myprod[102] = Formats.CURRENCY.parseValue(m_jPriceBuy21S.getText());
        myprod[103] = Formats.CURRENCY.parseValue(m_jPriceBuy22S.getText());
        
        return myprod;
    }    
    
    public Component getComponent() {
        return this;
    }
    
    private final static Double readCurrency(String sValue) {
        try {
            return (Double) Formats.CURRENCY.parseValue(sValue);
        } catch (BasicException e) {
            return null;
        }
    }
        
    private final static Double readPercent(String sValue) {
        try {
            return (Double) Formats.PERCENT.parseValue(sValue);
        } catch (BasicException e) {
            return null;
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m_jCodetype = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        m_jAtt = new javax.swing.JComboBox();
        m_jTax = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        m_jPriceSellTax = new javax.swing.JTextField();
        m_jmargin = new javax.swing.JTextField();
        m_jCode = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        m_jstockcost = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        m_jstockvolume = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        m_jCatalogOrder = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        m_jImage = new com.openbravo.data.gui.JImageEditor();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAttributes = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        m_jRef1 = new javax.swing.JTextField();
        m_jProd1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        m_jCant1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        m_jList = new javax.swing.JButton();
        m_jComment = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        m_jPriceBuy = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        m_jRef = new javax.swing.JTextField();
        m_jName = new javax.swing.JTextField();
        m_jTitle = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        m_jPriceSell = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        m_jCategory = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        m_jPriceSell1 = new javax.swing.JTextField();
        m_jPriceSell2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        m_jPriceSell3 = new javax.swing.JTextField();
        m_jPriceSell4 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        m_jInCatalog = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        m_jScale = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        m_jPriceSell5 = new javax.swing.JTextField();
        m_jPriceSell6 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        m_jPriceSell7 = new javax.swing.JTextField();
        m_jPriceSell8 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        m_jPriceSell9 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        m_jPriceSell10 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        m_jPriceSell11 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        m_jPriceSell12 = new javax.swing.JTextField();
        m_jPriceSell13 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        m_jPriceSell14 = new javax.swing.JTextField();
        m_jPriceSell15 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        m_jPriceSell16 = new javax.swing.JTextField();
        m_jPriceSell17 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        m_jPriceSell18 = new javax.swing.JTextField();
        m_jPriceSell19 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        m_jPriceSell20 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        m_jPriceSell21 = new javax.swing.JTextField();
        m_jPriceSell22 = new javax.swing.JTextField();
        m_jPriceSell23 = new javax.swing.JTextField();
        m_jPriceSell24 = new javax.swing.JTextField();
        m_jPriceSell25 = new javax.swing.JTextField();
        m_jPriceSell26 = new javax.swing.JTextField();
        m_jPriceSell27 = new javax.swing.JTextField();
        m_jPriceSell28 = new javax.swing.JTextField();
        m_jPriceSell29 = new javax.swing.JTextField();
        m_jPriceSell30 = new javax.swing.JTextField();
        m_jPriceSell31 = new javax.swing.JTextField();
        m_jPriceSell32 = new javax.swing.JTextField();
        m_jPriceSell33 = new javax.swing.JTextField();
        m_jPriceSell34 = new javax.swing.JTextField();
        m_jPriceSell35 = new javax.swing.JTextField();
        m_jPriceSell36 = new javax.swing.JTextField();
        m_jPriceSell37 = new javax.swing.JTextField();
        m_jPriceSell38 = new javax.swing.JTextField();
        m_jPriceSell39 = new javax.swing.JTextField();
        m_jPriceSell40 = new javax.swing.JTextField();
        m_jPriceSell41 = new javax.swing.JTextField();
        m_jPriceSell42 = new javax.swing.JTextField();
        m_jPriceSell43 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        m_jPriceBuy1 = new javax.swing.JTextField();
        m_jPriceBuy1S = new javax.swing.JTextField();
        m_jPriceBuy2S = new javax.swing.JTextField();
        m_jPriceBuy2 = new javax.swing.JTextField();
        m_jPriceBuy3 = new javax.swing.JTextField();
        m_jPriceBuy3S = new javax.swing.JTextField();
        m_jPriceBuy4S = new javax.swing.JTextField();
        m_jPriceBuy4 = new javax.swing.JTextField();
        m_jPriceBuy5 = new javax.swing.JTextField();
        m_jPriceBuy5S = new javax.swing.JTextField();
        m_jPriceBuy6 = new javax.swing.JTextField();
        m_jPriceBuy6S = new javax.swing.JTextField();
        m_jPriceBuy7 = new javax.swing.JTextField();
        m_jPriceBuy7S = new javax.swing.JTextField();
        m_jPriceBuy8 = new javax.swing.JTextField();
        m_jPriceBuy8S = new javax.swing.JTextField();
        m_jPriceBuy9 = new javax.swing.JTextField();
        m_jPriceBuy9S = new javax.swing.JTextField();
        m_jPriceBuy10 = new javax.swing.JTextField();
        m_jPriceBuy10S = new javax.swing.JTextField();
        m_jPriceBuy11S = new javax.swing.JTextField();
        m_jPriceBuy12S = new javax.swing.JTextField();
        m_jPriceBuy13S = new javax.swing.JTextField();
        m_jPriceBuy14S = new javax.swing.JTextField();
        m_jPriceBuy15S = new javax.swing.JTextField();
        m_jPriceBuy16S = new javax.swing.JTextField();
        m_jPriceBuy17S = new javax.swing.JTextField();
        m_jPriceBuy18S = new javax.swing.JTextField();
        m_jPriceBuy19S = new javax.swing.JTextField();
        m_jPriceBuy20S = new javax.swing.JTextField();
        m_jPriceBuy20 = new javax.swing.JTextField();
        m_jPriceBuy19 = new javax.swing.JTextField();
        m_jPriceBuy18 = new javax.swing.JTextField();
        m_jPriceBuy17 = new javax.swing.JTextField();
        m_jPriceBuy16 = new javax.swing.JTextField();
        m_jPriceBuy15 = new javax.swing.JTextField();
        m_jPriceBuy14 = new javax.swing.JTextField();
        m_jPriceBuy13 = new javax.swing.JTextField();
        m_jPriceBuy12 = new javax.swing.JTextField();
        m_jPriceBuy11 = new javax.swing.JTextField();
        m_jPriceBuy21 = new javax.swing.JTextField();
        m_jPriceBuy21S = new javax.swing.JTextField();
        m_jPriceBuy22S = new javax.swing.JTextField();
        m_jPriceBuy22 = new javax.swing.JTextField();

        jLabel13.setText(AppLocal.getIntString("label.attributes")); // NOI18N

        jLabel7.setText(AppLocal.getIntString("label.taxcategory")); // NOI18N

        jLabel16.setText(AppLocal.getIntString("label.prodpriceselltax")); // NOI18N

        m_jPriceSellTax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        m_jmargin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel6.setText(AppLocal.getIntString("label.prodbarcode")); // NOI18N

        jPanel2.setLayout(null);

        jLabel9.setText(AppLocal.getIntString("label.prodstockcost")); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 20, 150, 14);

        m_jstockcost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(m_jstockcost);
        m_jstockcost.setBounds(160, 20, 80, 20);

        jLabel10.setText(AppLocal.getIntString("label.prodstockvol")); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 50, 150, 14);

        m_jstockvolume.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(m_jstockvolume);
        m_jstockvolume.setBounds(160, 50, 80, 20);

        jLabel18.setText(AppLocal.getIntString("label.prodorder")); // NOI18N
        jPanel2.add(jLabel18);
        jLabel18.setBounds(250, 80, 60, 14);

        m_jCatalogOrder.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel2.add(m_jCatalogOrder);
        m_jCatalogOrder.setBounds(310, 80, 80, 20);

        jLabel11.setText(AppLocal.getIntString("label.prodaux")); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 110, 150, 14);

        jLabel12.setText(AppLocal.getIntString("label.prodscale")); // NOI18N
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 140, 150, 14);

        jLabel3.setText(AppLocal.getIntString("label.prodpricebuy")); // NOI18N

        txtAttributes.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(txtAttributes);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel3.setLayout(null);

        jLabel21.setText("Referencia");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(60, 20, 70, 14);

        m_jRef1.setEditable(false);
        jPanel3.add(m_jRef1);
        m_jRef1.setBounds(60, 40, 100, 30);

        m_jProd1.setEditable(false);
        jPanel3.add(m_jProd1);
        m_jProd1.setBounds(170, 40, 320, 30);

        jLabel22.setText("Nombre del producto");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(170, 20, 150, 14);
        jPanel3.add(m_jCant1);
        m_jCant1.setBounds(500, 40, 50, 30);

        jLabel23.setText("Cantidad");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(500, 20, 60, 14);

        m_jList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/openbravo/images/search22.png"))); // NOI18N
        m_jList.setFocusPainted(false);
        m_jList.setFocusable(false);
        m_jList.setMargin(new java.awt.Insets(8, 14, 8, 14));
        m_jList.setRequestFocusEnabled(false);
        m_jList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jListActionPerformed(evt);
            }
        });
        jPanel3.add(m_jList);
        m_jList.setBounds(10, 40, 40, 30);

        jPanel1.setLayout(null);

        setLayout(null);

        jLabel1.setText(AppLocal.getIntString("label.prodref")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(10, 50, 70, 14);

        m_jPriceBuy.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy);
        m_jPriceBuy.setBounds(640, 390, 60, 20);

        jLabel2.setText(AppLocal.getIntString("label.prodname")); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(170, 50, 70, 14);
        add(m_jRef);
        m_jRef.setBounds(80, 50, 80, 20);
        add(m_jName);
        m_jName.setBounds(240, 50, 450, 20);

        m_jTitle.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        add(m_jTitle);
        m_jTitle.setBounds(10, 10, 860, 30);

        jLabel4.setText("P. Compra");
        add(jLabel4);
        jLabel4.setBounds(580, 390, 60, 14);

        m_jPriceSell.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell);
        m_jPriceSell.setBounds(50, 80, 50, 20);

        jLabel5.setText(AppLocal.getIntString("label.prodcategory")); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(10, 390, 80, 14);
        add(m_jCategory);
        m_jCategory.setBounds(90, 390, 170, 20);

        jLabel14.setText("0.500");
        add(jLabel14);
        jLabel14.setBounds(10, 110, 40, 14);

        m_jPriceSell1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell1);
        m_jPriceSell1.setBounds(50, 110, 50, 20);

        m_jPriceSell2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell2);
        m_jPriceSell2.setBounds(50, 140, 50, 20);

        jLabel15.setText("1");
        add(jLabel15);
        jLabel15.setBounds(10, 140, 40, 14);

        jLabel17.setText("3");
        add(jLabel17);
        jLabel17.setBounds(10, 200, 40, 14);

        m_jPriceSell3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell3);
        m_jPriceSell3.setBounds(50, 170, 50, 20);

        m_jPriceSell4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell4);
        m_jPriceSell4.setBounds(50, 200, 50, 20);

        jLabel19.setText("2");
        add(jLabel19);
        jLabel19.setBounds(10, 170, 40, 14);

        jLabel8.setText(AppLocal.getIntString("label.prodincatalog")); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(270, 390, 100, 14);

        m_jInCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jInCatalogActionPerformed(evt);
            }
        });
        add(m_jInCatalog);
        m_jInCatalog.setBounds(370, 390, 50, 21);

        jLabel20.setText("Mostrar opciones?");
        add(jLabel20);
        jLabel20.setBounds(420, 390, 120, 14);
        add(m_jScale);
        m_jScale.setBounds(540, 390, 80, 21);

        jLabel24.setText("4");
        add(jLabel24);
        jLabel24.setBounds(10, 230, 40, 14);

        m_jPriceSell5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell5);
        m_jPriceSell5.setBounds(50, 230, 50, 20);

        m_jPriceSell6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell6);
        m_jPriceSell6.setBounds(50, 260, 50, 20);

        jLabel25.setText("7");
        add(jLabel25);
        jLabel25.setBounds(10, 320, 40, 14);

        jLabel26.setText("6");
        add(jLabel26);
        jLabel26.setBounds(10, 290, 40, 14);

        m_jPriceSell7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell7);
        m_jPriceSell7.setBounds(50, 290, 50, 20);

        m_jPriceSell8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell8);
        m_jPriceSell8.setBounds(50, 320, 50, 20);

        jLabel27.setText("5");
        add(jLabel27);
        jLabel27.setBounds(10, 260, 40, 14);

        m_jPriceSell9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell9);
        m_jPriceSell9.setBounds(50, 350, 50, 20);

        jLabel28.setText("8");
        add(jLabel28);
        jLabel28.setBounds(10, 350, 40, 14);

        m_jPriceSell10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell10);
        m_jPriceSell10.setBounds(300, 80, 50, 20);

        jLabel29.setText("9");
        add(jLabel29);
        jLabel29.setBounds(270, 80, 30, 14);

        jLabel30.setText("10");
        add(jLabel30);
        jLabel30.setBounds(270, 110, 30, 14);

        m_jPriceSell11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell11);
        m_jPriceSell11.setBounds(300, 110, 50, 20);

        jLabel31.setText("11");
        add(jLabel31);
        jLabel31.setBounds(270, 140, 30, 14);

        m_jPriceSell12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell12);
        m_jPriceSell12.setBounds(300, 140, 50, 20);

        m_jPriceSell13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell13);
        m_jPriceSell13.setBounds(300, 170, 50, 20);

        jLabel32.setText("12");
        add(jLabel32);
        jLabel32.setBounds(270, 170, 30, 14);

        jLabel33.setText("13");
        add(jLabel33);
        jLabel33.setBounds(270, 200, 30, 14);

        m_jPriceSell14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell14);
        m_jPriceSell14.setBounds(300, 200, 50, 20);

        m_jPriceSell15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell15);
        m_jPriceSell15.setBounds(300, 230, 50, 20);

        jLabel34.setText("18");
        add(jLabel34);
        jLabel34.setBounds(270, 350, 30, 14);

        jLabel35.setText("17");
        add(jLabel35);
        jLabel35.setBounds(270, 320, 30, 14);

        m_jPriceSell16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell16);
        m_jPriceSell16.setBounds(300, 260, 50, 20);

        m_jPriceSell17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell17);
        m_jPriceSell17.setBounds(300, 290, 50, 20);

        jLabel36.setText("16");
        add(jLabel36);
        jLabel36.setBounds(270, 290, 30, 14);

        jLabel37.setText("15");
        add(jLabel37);
        jLabel37.setBounds(270, 260, 30, 14);

        m_jPriceSell18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell18);
        m_jPriceSell18.setBounds(300, 320, 50, 20);

        m_jPriceSell19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell19);
        m_jPriceSell19.setBounds(300, 350, 50, 20);

        jLabel38.setText("14");
        add(jLabel38);
        jLabel38.setBounds(270, 230, 30, 14);

        jLabel39.setText("19");
        add(jLabel39);
        jLabel39.setBounds(530, 80, 40, 14);

        m_jPriceSell20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell20);
        m_jPriceSell20.setBounds(560, 80, 50, 20);

        jLabel40.setText("200");
        add(jLabel40);
        jLabel40.setBounds(530, 110, 40, 14);

        m_jPriceSell21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell21);
        m_jPriceSell21.setBounds(560, 110, 50, 20);

        m_jPriceSell22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell22);
        m_jPriceSell22.setBounds(100, 80, 50, 20);

        m_jPriceSell23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell23);
        m_jPriceSell23.setBounds(100, 110, 50, 20);

        m_jPriceSell24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell24);
        m_jPriceSell24.setBounds(100, 140, 50, 20);

        m_jPriceSell25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell25);
        m_jPriceSell25.setBounds(100, 170, 50, 20);

        m_jPriceSell26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell26);
        m_jPriceSell26.setBounds(100, 200, 50, 20);

        m_jPriceSell27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell27);
        m_jPriceSell27.setBounds(100, 230, 50, 20);

        m_jPriceSell28.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell28);
        m_jPriceSell28.setBounds(100, 260, 50, 20);

        m_jPriceSell29.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell29);
        m_jPriceSell29.setBounds(100, 290, 50, 20);

        m_jPriceSell30.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell30);
        m_jPriceSell30.setBounds(100, 320, 50, 20);

        m_jPriceSell31.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell31);
        m_jPriceSell31.setBounds(100, 350, 50, 20);

        m_jPriceSell32.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell32);
        m_jPriceSell32.setBounds(350, 80, 50, 20);

        m_jPriceSell33.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell33);
        m_jPriceSell33.setBounds(350, 110, 50, 20);

        m_jPriceSell34.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell34);
        m_jPriceSell34.setBounds(350, 140, 50, 20);

        m_jPriceSell35.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell35);
        m_jPriceSell35.setBounds(350, 170, 50, 20);

        m_jPriceSell36.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell36);
        m_jPriceSell36.setBounds(350, 200, 50, 20);

        m_jPriceSell37.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell37);
        m_jPriceSell37.setBounds(350, 230, 50, 20);

        m_jPriceSell38.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell38);
        m_jPriceSell38.setBounds(350, 260, 50, 20);

        m_jPriceSell39.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell39);
        m_jPriceSell39.setBounds(350, 290, 50, 20);

        m_jPriceSell40.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell40);
        m_jPriceSell40.setBounds(350, 320, 50, 20);

        m_jPriceSell41.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell41);
        m_jPriceSell41.setBounds(350, 350, 50, 20);

        m_jPriceSell42.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell42);
        m_jPriceSell42.setBounds(610, 80, 50, 20);

        m_jPriceSell43.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceSell43);
        m_jPriceSell43.setBounds(610, 110, 50, 20);

        jLabel41.setText("0.250");
        add(jLabel41);
        jLabel41.setBounds(10, 80, 40, 14);

        m_jPriceBuy1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy1);
        m_jPriceBuy1.setBounds(150, 80, 50, 20);

        m_jPriceBuy1S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy1S);
        m_jPriceBuy1S.setBounds(200, 80, 50, 20);

        m_jPriceBuy2S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy2S);
        m_jPriceBuy2S.setBounds(200, 110, 50, 20);

        m_jPriceBuy2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy2);
        m_jPriceBuy2.setBounds(150, 110, 50, 20);

        m_jPriceBuy3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy3);
        m_jPriceBuy3.setBounds(150, 140, 50, 20);

        m_jPriceBuy3S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy3S);
        m_jPriceBuy3S.setBounds(200, 140, 50, 20);

        m_jPriceBuy4S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy4S);
        m_jPriceBuy4S.setBounds(200, 170, 50, 20);

        m_jPriceBuy4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy4);
        m_jPriceBuy4.setBounds(150, 170, 50, 20);

        m_jPriceBuy5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy5);
        m_jPriceBuy5.setBounds(150, 200, 50, 20);

        m_jPriceBuy5S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy5S);
        m_jPriceBuy5S.setBounds(200, 200, 50, 20);

        m_jPriceBuy6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy6);
        m_jPriceBuy6.setBounds(150, 230, 50, 20);

        m_jPriceBuy6S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy6S);
        m_jPriceBuy6S.setBounds(200, 230, 50, 20);

        m_jPriceBuy7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy7);
        m_jPriceBuy7.setBounds(150, 260, 50, 20);

        m_jPriceBuy7S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy7S);
        m_jPriceBuy7S.setBounds(200, 260, 50, 20);

        m_jPriceBuy8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy8);
        m_jPriceBuy8.setBounds(150, 290, 50, 20);

        m_jPriceBuy8S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy8S);
        m_jPriceBuy8S.setBounds(200, 290, 50, 20);

        m_jPriceBuy9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy9);
        m_jPriceBuy9.setBounds(150, 320, 50, 20);

        m_jPriceBuy9S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy9S);
        m_jPriceBuy9S.setBounds(200, 320, 50, 20);

        m_jPriceBuy10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy10);
        m_jPriceBuy10.setBounds(150, 350, 50, 20);

        m_jPriceBuy10S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy10S);
        m_jPriceBuy10S.setBounds(200, 350, 50, 20);

        m_jPriceBuy11S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy11S);
        m_jPriceBuy11S.setBounds(450, 80, 50, 20);

        m_jPriceBuy12S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy12S);
        m_jPriceBuy12S.setBounds(450, 110, 50, 20);

        m_jPriceBuy13S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy13S);
        m_jPriceBuy13S.setBounds(450, 140, 50, 20);

        m_jPriceBuy14S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy14S);
        m_jPriceBuy14S.setBounds(450, 170, 50, 20);

        m_jPriceBuy15S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy15S);
        m_jPriceBuy15S.setBounds(450, 200, 50, 20);

        m_jPriceBuy16S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy16S);
        m_jPriceBuy16S.setBounds(450, 230, 50, 20);

        m_jPriceBuy17S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy17S);
        m_jPriceBuy17S.setBounds(450, 260, 50, 20);

        m_jPriceBuy18S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy18S);
        m_jPriceBuy18S.setBounds(450, 290, 50, 20);

        m_jPriceBuy19S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy19S);
        m_jPriceBuy19S.setBounds(450, 320, 50, 20);

        m_jPriceBuy20S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy20S);
        m_jPriceBuy20S.setBounds(450, 350, 50, 20);

        m_jPriceBuy20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy20);
        m_jPriceBuy20.setBounds(400, 350, 50, 20);

        m_jPriceBuy19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy19);
        m_jPriceBuy19.setBounds(400, 320, 50, 20);

        m_jPriceBuy18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy18);
        m_jPriceBuy18.setBounds(400, 290, 50, 20);

        m_jPriceBuy17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy17);
        m_jPriceBuy17.setBounds(400, 260, 50, 20);

        m_jPriceBuy16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy16);
        m_jPriceBuy16.setBounds(400, 230, 50, 20);

        m_jPriceBuy15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy15);
        m_jPriceBuy15.setBounds(400, 200, 50, 20);

        m_jPriceBuy14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy14);
        m_jPriceBuy14.setBounds(400, 170, 50, 20);

        m_jPriceBuy13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy13);
        m_jPriceBuy13.setBounds(400, 140, 50, 20);

        m_jPriceBuy12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy12);
        m_jPriceBuy12.setBounds(400, 110, 50, 20);

        m_jPriceBuy11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy11);
        m_jPriceBuy11.setBounds(400, 80, 50, 20);

        m_jPriceBuy21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy21);
        m_jPriceBuy21.setBounds(660, 80, 50, 20);

        m_jPriceBuy21S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy21S);
        m_jPriceBuy21S.setBounds(710, 80, 50, 20);

        m_jPriceBuy22S.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy22S);
        m_jPriceBuy22S.setBounds(710, 110, 50, 20);

        m_jPriceBuy22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(m_jPriceBuy22);
        m_jPriceBuy22.setBounds(660, 110, 50, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void m_jInCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jInCatalogActionPerformed
 
        if (m_jInCatalog.isSelected()) {
            m_jCatalogOrder.setEnabled(true);   
        } else {
            m_jCatalogOrder.setEnabled(false);   
            m_jCatalogOrder.setText(null);   
        }

    }//GEN-LAST:event_m_jInCatalogActionPerformed

    private void m_jListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jListActionPerformed

    }//GEN-LAST:event_m_jListActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox m_jAtt;
    private javax.swing.JTextField m_jCant1;
    private javax.swing.JTextField m_jCatalogOrder;
    private javax.swing.JComboBox m_jCategory;
    private javax.swing.JTextField m_jCode;
    private javax.swing.JComboBox m_jCodetype;
    private javax.swing.JCheckBox m_jComment;
    private com.openbravo.data.gui.JImageEditor m_jImage;
    private javax.swing.JCheckBox m_jInCatalog;
    private javax.swing.JButton m_jList;
    private javax.swing.JTextField m_jName;
    private javax.swing.JTextField m_jPriceBuy;
    private javax.swing.JTextField m_jPriceBuy1;
    private javax.swing.JTextField m_jPriceBuy10;
    private javax.swing.JTextField m_jPriceBuy10S;
    private javax.swing.JTextField m_jPriceBuy11;
    private javax.swing.JTextField m_jPriceBuy11S;
    private javax.swing.JTextField m_jPriceBuy12;
    private javax.swing.JTextField m_jPriceBuy12S;
    private javax.swing.JTextField m_jPriceBuy13;
    private javax.swing.JTextField m_jPriceBuy13S;
    private javax.swing.JTextField m_jPriceBuy14;
    private javax.swing.JTextField m_jPriceBuy14S;
    private javax.swing.JTextField m_jPriceBuy15;
    private javax.swing.JTextField m_jPriceBuy15S;
    private javax.swing.JTextField m_jPriceBuy16;
    private javax.swing.JTextField m_jPriceBuy16S;
    private javax.swing.JTextField m_jPriceBuy17;
    private javax.swing.JTextField m_jPriceBuy17S;
    private javax.swing.JTextField m_jPriceBuy18;
    private javax.swing.JTextField m_jPriceBuy18S;
    private javax.swing.JTextField m_jPriceBuy19;
    private javax.swing.JTextField m_jPriceBuy19S;
    private javax.swing.JTextField m_jPriceBuy1S;
    private javax.swing.JTextField m_jPriceBuy2;
    private javax.swing.JTextField m_jPriceBuy20;
    private javax.swing.JTextField m_jPriceBuy20S;
    private javax.swing.JTextField m_jPriceBuy21;
    private javax.swing.JTextField m_jPriceBuy21S;
    private javax.swing.JTextField m_jPriceBuy22;
    private javax.swing.JTextField m_jPriceBuy22S;
    private javax.swing.JTextField m_jPriceBuy2S;
    private javax.swing.JTextField m_jPriceBuy3;
    private javax.swing.JTextField m_jPriceBuy3S;
    private javax.swing.JTextField m_jPriceBuy4;
    private javax.swing.JTextField m_jPriceBuy4S;
    private javax.swing.JTextField m_jPriceBuy5;
    private javax.swing.JTextField m_jPriceBuy5S;
    private javax.swing.JTextField m_jPriceBuy6;
    private javax.swing.JTextField m_jPriceBuy6S;
    private javax.swing.JTextField m_jPriceBuy7;
    private javax.swing.JTextField m_jPriceBuy7S;
    private javax.swing.JTextField m_jPriceBuy8;
    private javax.swing.JTextField m_jPriceBuy8S;
    private javax.swing.JTextField m_jPriceBuy9;
    private javax.swing.JTextField m_jPriceBuy9S;
    private javax.swing.JTextField m_jPriceSell;
    private javax.swing.JTextField m_jPriceSell1;
    private javax.swing.JTextField m_jPriceSell10;
    private javax.swing.JTextField m_jPriceSell11;
    private javax.swing.JTextField m_jPriceSell12;
    private javax.swing.JTextField m_jPriceSell13;
    private javax.swing.JTextField m_jPriceSell14;
    private javax.swing.JTextField m_jPriceSell15;
    private javax.swing.JTextField m_jPriceSell16;
    private javax.swing.JTextField m_jPriceSell17;
    private javax.swing.JTextField m_jPriceSell18;
    private javax.swing.JTextField m_jPriceSell19;
    private javax.swing.JTextField m_jPriceSell2;
    private javax.swing.JTextField m_jPriceSell20;
    private javax.swing.JTextField m_jPriceSell21;
    private javax.swing.JTextField m_jPriceSell22;
    private javax.swing.JTextField m_jPriceSell23;
    private javax.swing.JTextField m_jPriceSell24;
    private javax.swing.JTextField m_jPriceSell25;
    private javax.swing.JTextField m_jPriceSell26;
    private javax.swing.JTextField m_jPriceSell27;
    private javax.swing.JTextField m_jPriceSell28;
    private javax.swing.JTextField m_jPriceSell29;
    private javax.swing.JTextField m_jPriceSell3;
    private javax.swing.JTextField m_jPriceSell30;
    private javax.swing.JTextField m_jPriceSell31;
    private javax.swing.JTextField m_jPriceSell32;
    private javax.swing.JTextField m_jPriceSell33;
    private javax.swing.JTextField m_jPriceSell34;
    private javax.swing.JTextField m_jPriceSell35;
    private javax.swing.JTextField m_jPriceSell36;
    private javax.swing.JTextField m_jPriceSell37;
    private javax.swing.JTextField m_jPriceSell38;
    private javax.swing.JTextField m_jPriceSell39;
    private javax.swing.JTextField m_jPriceSell4;
    private javax.swing.JTextField m_jPriceSell40;
    private javax.swing.JTextField m_jPriceSell41;
    private javax.swing.JTextField m_jPriceSell42;
    private javax.swing.JTextField m_jPriceSell43;
    private javax.swing.JTextField m_jPriceSell5;
    private javax.swing.JTextField m_jPriceSell6;
    private javax.swing.JTextField m_jPriceSell7;
    private javax.swing.JTextField m_jPriceSell8;
    private javax.swing.JTextField m_jPriceSell9;
    private javax.swing.JTextField m_jPriceSellTax;
    private javax.swing.JTextField m_jProd1;
    private javax.swing.JTextField m_jRef;
    private javax.swing.JTextField m_jRef1;
    private javax.swing.JCheckBox m_jScale;
    private javax.swing.JComboBox m_jTax;
    private javax.swing.JLabel m_jTitle;
    private javax.swing.JTextField m_jmargin;
    private javax.swing.JTextField m_jstockcost;
    private javax.swing.JTextField m_jstockvolume;
    private javax.swing.JTextArea txtAttributes;
    // End of variables declaration//GEN-END:variables
    
}
