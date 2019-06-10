package com.openbravo.pos.ticket;

import java.awt.image.BufferedImage;
import com.openbravo.data.loader.DataRead;
import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.ImageUtils;
import com.openbravo.data.loader.SerializerRead;
import com.openbravo.format.Formats;
import java.util.Properties;

public class ProductInfoExt {

    private static final long serialVersionUID = 7587696873036L;

    protected String m_ID;
    protected String m_sRef;
    protected String m_sCode;
    protected String m_sName;
    protected boolean m_bCom;
    protected boolean m_bScale;
    protected String categoryid;
    protected String taxcategoryid;
    protected String attributesetid;
    protected double m_dPriceBuy;
    protected double m_dPriceSell;
    protected double m_dPriceSell1;
    protected double m_dPriceSell2;
    protected double m_dPriceSell3;
    protected double m_dPriceSell4;
    protected double m_dPriceSell5;
    protected double m_dPriceSell6;
    protected double m_dPriceSell7;
    protected double m_dPriceSell8;
    protected double m_dPriceSell9;
    protected double m_dPriceSell10;
    protected double m_dPriceSell11;
    protected double m_dPriceSell12;
    protected double m_dPriceSell13;
    protected double m_dPriceSell14;
    protected double m_dPriceSell15;
    protected double m_dPriceSell16;
    protected double m_dPriceSell17;
    protected double m_dPriceSell18;
    protected double m_dPriceSell19;
    protected double m_dPriceSell20;
    protected double m_dPriceSell21;
    protected double m_dPriceSell22;
    protected double m_dPriceSell23;
    protected double m_dPriceSell24;
    protected double m_dPriceSell25;
    protected double m_dPriceSell26;
    protected double m_dPriceSell27;
    protected double m_dPriceSell28;
    protected double m_dPriceSell29;
    protected double m_dPriceSell30;
    protected double m_dPriceSell31;
    protected double m_dPriceSell32;
    protected double m_dPriceSell33;
    protected double m_dPriceSell34;
    protected double m_dPriceSell35;
    protected double m_dPriceSell36;
    protected double m_dPriceSell37;
    protected double m_dPriceSell38;
    protected double m_dPriceSell39;
    protected double m_dPriceSell40;
    protected double m_dPriceSell41;
    protected double m_dPriceSell42;
    protected double m_dPriceSell43;
    
    protected double m_dPriceBuy1;
    protected double m_dPriceBuy2;
    protected double m_dPriceBuy3;
    protected double m_dPriceBuy4;
    protected double m_dPriceBuy5;
    protected double m_dPriceBuy6;
    protected double m_dPriceBuy7;
    protected double m_dPriceBuy8;
    protected double m_dPriceBuy9;
    protected double m_dPriceBuy10;
    protected double m_dPriceBuy11;
    protected double m_dPriceBuy12;
    protected double m_dPriceBuy13;
    protected double m_dPriceBuy14;
    protected double m_dPriceBuy15;
    protected double m_dPriceBuy16;
    protected double m_dPriceBuy17;
    protected double m_dPriceBuy18;
    protected double m_dPriceBuy19;
    protected double m_dPriceBuy20;
    protected double m_dPriceBuy21;
    protected double m_dPriceBuy22;

    protected double m_dPriceBuy1S;
    protected double m_dPriceBuy2S;
    protected double m_dPriceBuy3S;
    protected double m_dPriceBuy4S;
    protected double m_dPriceBuy5S;
    protected double m_dPriceBuy6S;
    protected double m_dPriceBuy7S;
    protected double m_dPriceBuy8S;
    protected double m_dPriceBuy9S;
    protected double m_dPriceBuy10S;
    protected double m_dPriceBuy11S;
    protected double m_dPriceBuy12S;
    protected double m_dPriceBuy13S;
    protected double m_dPriceBuy14S;
    protected double m_dPriceBuy15S;
    protected double m_dPriceBuy16S;
    protected double m_dPriceBuy17S;
    protected double m_dPriceBuy18S;
    protected double m_dPriceBuy19S;
    protected double m_dPriceBuy20S;
    protected double m_dPriceBuy21S;
    protected double m_dPriceBuy22S;
    protected BufferedImage m_Image;
    protected Properties attributes;
    
    public ProductInfoExt() {
        m_ID = null;
        m_sRef = "0000";
        m_sCode = "0000";
        m_sName = null;
        m_bCom = false;
        m_bScale = false;
        categoryid = null;
        taxcategoryid = null;
        attributesetid = null;
        m_dPriceBuy = 0.0;
        m_dPriceSell = 0.0;
        m_dPriceSell1 = 0.0;
        m_dPriceSell2 = 0.0;
        m_dPriceSell3 = 0.0;
        m_dPriceSell4 = 0.0;
        m_dPriceSell5 = 0.0;
        m_dPriceSell6 = 0.0;
        m_dPriceSell7 = 0.0;
        m_dPriceSell8 = 0.0;
        m_dPriceSell9 = 0.0;
        m_dPriceSell10 = 0.0;
        m_dPriceSell11 = 0.0;
        m_dPriceSell12 = 0.0;
        m_dPriceSell13 = 0.0;
        m_dPriceSell14 = 0.0;
        m_dPriceSell15 = 0.0;
        m_dPriceSell16 = 0.0;
        m_dPriceSell17 = 0.0;
        m_dPriceSell18 = 0.0;
        m_dPriceSell19 = 0.0;
        m_dPriceSell20 = 0.0;
        m_dPriceSell21 = 0.0;
        m_dPriceSell22 = 0.0;
        m_dPriceSell23 = 0.0;
        m_dPriceSell24 = 0.0;
        m_dPriceSell25 = 0.0;
        m_dPriceSell26 = 0.0;
        m_dPriceSell27 = 0.0;
        m_dPriceSell28 = 0.0;
        m_dPriceSell29 = 0.0;
        m_dPriceSell30 = 0.0;
        m_dPriceSell31 = 0.0;
        m_dPriceSell32 = 0.0;
        m_dPriceSell33 = 0.0;
        m_dPriceSell34 = 0.0;
        m_dPriceSell35 = 0.0;
        m_dPriceSell36 = 0.0;
        m_dPriceSell37 = 0.0;
        m_dPriceSell38 = 0.0;
        m_dPriceSell39 = 0.0;
        m_dPriceSell40 = 0.0;
        m_dPriceSell41 = 0.0;
        m_dPriceSell42 = 0.0;
        m_dPriceSell43 = 0.0;
        
        m_dPriceBuy1 = 0.0;
        m_dPriceBuy2 = 0.0;
        m_dPriceBuy3 = 0.0;
        m_dPriceBuy4 = 0.0;
        m_dPriceBuy5 = 0.0;
        m_dPriceBuy6 = 0.0;
        m_dPriceBuy7 = 0.0;
        m_dPriceBuy8 = 0.0;
        m_dPriceBuy9 = 0.0;
        m_dPriceBuy10 = 0.0;
        m_dPriceBuy11 = 0.0;
        m_dPriceBuy12 = 0.0;
        m_dPriceBuy13 = 0.0;
        m_dPriceBuy14 = 0.0;
        m_dPriceBuy15 = 0.0;
        m_dPriceBuy16 = 0.0;
        m_dPriceBuy17 = 0.0;
        m_dPriceBuy18 = 0.0;
        m_dPriceBuy19 = 0.0;
        m_dPriceBuy20 = 0.0;
        m_dPriceBuy21 = 0.0;
        m_dPriceBuy22 = 0.0;
        
        m_dPriceBuy1S = 0.0;
        m_dPriceBuy2S = 0.0;
        m_dPriceBuy3S = 0.0;
        m_dPriceBuy4S = 0.0;
        m_dPriceBuy5S = 0.0;
        m_dPriceBuy6S = 0.0;
        m_dPriceBuy7S = 0.0;
        m_dPriceBuy8S = 0.0;
        m_dPriceBuy9S = 0.0;
        m_dPriceBuy10S = 0.0;
        m_dPriceBuy11S = 0.0;
        m_dPriceBuy12S = 0.0;
        m_dPriceBuy13S = 0.0;
        m_dPriceBuy14S = 0.0;
        m_dPriceBuy15S = 0.0;
        m_dPriceBuy16S = 0.0;
        m_dPriceBuy17S = 0.0;
        m_dPriceBuy18S = 0.0;
        m_dPriceBuy19S = 0.0;
        m_dPriceBuy20S = 0.0;
        m_dPriceBuy21S = 0.0;
        m_dPriceBuy22S = 0.0;
        m_Image = null;
        attributes = new Properties();
    }

    public final String getID() {
        return m_ID;
    }

    public final void setID(String id) {
        m_ID = id;
    }

    public final String getReference() {
        return m_sRef;
    }

    public final void setReference(String sRef) {
        m_sRef = sRef;
    }

    public final String getCode() {
        return m_sCode;
    }

    public final void setCode(String sCode) {
        m_sCode = sCode;
    }

    public final String getName() {
        return m_sName;
    }

    public final void setName(String sName) {
        m_sName = sName;
    }

    public final boolean isCom() {
        return m_bCom;
    }

    public final void setCom(boolean bValue) {
        m_bCom = bValue;
    }

    public final boolean isScale() {
        return m_bScale;
    }

    public final void setScale(boolean bValue) {
        m_bScale = bValue;
    }

    public final String getCategoryID() {
        return categoryid;
    }

    public final void setCategoryID(String sCategoryID) {
        categoryid = sCategoryID;
    }

    public final String getTaxCategoryID() {
        return taxcategoryid;
    }

    public final void setTaxCategoryID(String value) {
        taxcategoryid = value;
    }

    public final String getAttributeSetID() {
        return attributesetid;
    }
    public final void setAttributeSetID(String value) {
        attributesetid = value;
    }

    public final double getPriceBuy() {
        return m_dPriceBuy;
    }

    public final void setPriceBuy(double dPrice) {
        m_dPriceBuy = dPrice;
    }
    

    public final double getPriceSell() {
        return m_dPriceSell;
    }
    public final double getPriceSell1() {
        return m_dPriceSell1;
    }
    public final double getPriceSell2() {
        return m_dPriceSell2;
    }
    public final double getPriceSell3() {
        return m_dPriceSell3;
    }
    public final double getPriceSell4() {
        return m_dPriceSell4;
    }
    public final double getPriceSell5() {
        return m_dPriceSell5;
    }
    public final double getPriceSell6() {
        return m_dPriceSell6;
    }
    public final double getPriceSell7() {
        return m_dPriceSell7;
    }
    public final double getPriceSell8() {
        return m_dPriceSell8;
    }
    public final double getPriceSell9() {
        return m_dPriceSell9;
    }
    public final double getPriceSell10() {
        return m_dPriceSell10;
    }
    public final double getPriceSell11() {
        return m_dPriceSell11;
    }
    public final double getPriceSell12() {
        return m_dPriceSell12;
    }
    public final double getPriceSell13() {
        return m_dPriceSell13;
    }
    public final double getPriceSell14() {
        return m_dPriceSell14;
    }
    public final double getPriceSell15() {
        return m_dPriceSell15;
    }
    public final double getPriceSell16() {
        return m_dPriceSell16;
    }
    public final double getPriceSell17() {
        return m_dPriceSell17;
    }
    public final double getPriceSell18() {
        return m_dPriceSell18;
    }
    public final double getPriceSell19() {
        return m_dPriceSell19;
    }
    public final double getPriceSell20() {
        return m_dPriceSell20;
    }
    public final double getPriceSell21() {
        return m_dPriceSell21;
    }
    public final double getPriceSell22() {
        return m_dPriceSell22;
    }
    public final double getPriceSell23() {
        return m_dPriceSell23;
    }
    public final double getPriceSell24() {
        return m_dPriceSell24;
    }
    public final double getPriceSell25() {
        return m_dPriceSell25;
    }
    public final double getPriceSell26() {
        return m_dPriceSell26;
    }
    public final double getPriceSell27() {
        return m_dPriceSell27;
    }
    public final double getPriceSell28() {
        return m_dPriceSell28;
    }
    public final double getPriceSell29() {
        return m_dPriceSell29;
    }
    public final double getPriceSell30() {
        return m_dPriceSell30;
    }
    public final double getPriceSell31() {
        return m_dPriceSell31;
    }
    public final double getPriceSell32() {
        return m_dPriceSell32;
    }
    public final double getPriceSell33() {
        return m_dPriceSell33;
    }
    public final double getPriceSell34() {
        return m_dPriceSell34;
    }
    public final double getPriceSell35() {
        return m_dPriceSell35;
    }
    public final double getPriceSell36() {
        return m_dPriceSell36;
    }
    public final double getPriceSell37() {
        return m_dPriceSell37;
    }
    public final double getPriceSell38() {
        return m_dPriceSell38;
    }
    public final double getPriceSell39() {
        return m_dPriceSell39;
    }
    public final double getPriceSell40() {
        return m_dPriceSell40;
    }
    public final double getPriceSell41() {
        return m_dPriceSell41;
    }
    public final double getPriceSell42() {
        return m_dPriceSell42;
    }
    public final double getPriceSell43() {
        return m_dPriceSell43;
    }
    
    public final double getPriceBuy1() {
        return m_dPriceBuy1;
    }
    public final double getPriceBuy2() {
        return m_dPriceBuy2;
    }
    public final double getPriceBuy3() {
        return m_dPriceBuy3;
    }
    public final double getPriceBuy4() {
        return m_dPriceBuy4;
    }
    public final double getPriceBuy5() {
        return m_dPriceBuy5;
    }
    public final double getPriceBuy6() {
        return m_dPriceBuy6;
    }
    public final double getPriceBuy7() {
        return m_dPriceBuy7;
    }
    public final double getPriceBuy8() {
        return m_dPriceBuy8;
    }
    public final double getPriceBuy9() {
        return m_dPriceBuy9;
    }
    public final double getPriceBuy10() {
        return m_dPriceBuy10;
    }
    public final double getPriceBuy11() {
        return m_dPriceBuy11;
    }
    public final double getPriceBuy12() {
        return m_dPriceBuy12;
    }
    public final double getPriceBuy13() {
        return m_dPriceBuy13;
    }
    public final double getPriceBuy14() {
        return m_dPriceBuy14;
    }
    public final double getPriceBuy15() {
        return m_dPriceBuy15;
    }
    public final double getPriceBuy16() {
        return m_dPriceBuy16;
    }
    public final double getPriceBuy17() {
        return m_dPriceBuy17;
    }
    public final double getPriceBuy18() {
        return m_dPriceBuy18;
    }
    public final double getPriceBuy19() {
        return m_dPriceBuy19;
    }
    public final double getPriceBuy20() {
        return m_dPriceBuy20;
    }
    public final double getPriceBuy21() {
        return m_dPriceBuy21;
    }
    public final double getPriceBuy22() {
        return m_dPriceBuy22;
    }
    public final double getPriceBuy1S() {
        return m_dPriceBuy1S;
    }
    public final double getPriceBuy2S() {
        return m_dPriceBuy2S;
    }
    public final double getPriceBuy3S() {
        return m_dPriceBuy3S;
    }
    public final double getPriceBuy4S() {
        return m_dPriceBuy4S;
    }
    public final double getPriceBuy5S() {
        return m_dPriceBuy5S;
    }
    public final double getPriceBuy6S() {
        return m_dPriceBuy6S;
    }
    public final double getPriceBuy7S() {
        return m_dPriceBuy7S;
    }
    public final double getPriceBuy8S() {
        return m_dPriceBuy8S;
    }
    public final double getPriceBuy9S() {
        return m_dPriceBuy9S;
    }
    public final double getPriceBuy10S() {
        return m_dPriceBuy10S;
    }
    public final double getPriceBuy11S() {
        return m_dPriceBuy11S;
    }
    public final double getPriceBuy12S() {
        return m_dPriceBuy12S;
    }
    public final double getPriceBuy13S() {
        return m_dPriceBuy13S;
    }
    public final double getPriceBuy14S() {
        return m_dPriceBuy14S;
    }
    public final double getPriceBuy15S() {
        return m_dPriceBuy15S;
    }
    public final double getPriceBuy16S() {
        return m_dPriceBuy16S;
    }
    public final double getPriceBuy17S() {
        return m_dPriceBuy17S;
    }
    public final double getPriceBuy18S() {
        return m_dPriceBuy18S;
    }
    public final double getPriceBuy19S() {
        return m_dPriceBuy19S;
    }
    public final double getPriceBuy20S() {
        return m_dPriceBuy20S;
    }
    public final double getPriceBuy21S() {
        return m_dPriceBuy21S;
    }
    public final double getPriceBuy22S() {
        return m_dPriceBuy22S;
    }
    public final void setPriceSell(double dPrice) {
        m_dPriceSell = dPrice;
    }
    public final double getPriceSellTax(TaxInfo tax) {
        return m_dPriceSell * (1.0 + tax.getRate());
    }

    public String printPriceSell() {
        return Formats.CURRENCY.formatValue(new Double(getPriceSell()));
    }

    public String printPriceSellTax(TaxInfo tax) {
        return Formats.CURRENCY.formatValue(new Double(getPriceSellTax(tax)));
    }
    
    public BufferedImage getImage() {
        return m_Image;
    }
    public void setImage(BufferedImage img) {
        m_Image = img;
    }
    
    public String getProperty(String key) {
        return attributes.getProperty(key);
    }
    public String getProperty(String key, String defaultvalue) {
        return attributes.getProperty(key, defaultvalue);
    }
    public void setProperty(String key, String value) {
        attributes.setProperty(key, value);
    }
    public Properties getProperties() {
        return attributes;
    }
    public static SerializerRead getSerializerRead() {
        return new SerializerRead() { public Object readValues(DataRead dr) throws BasicException {
            ProductInfoExt product = new ProductInfoExt();
            product.m_ID = dr.getString(1);
            product.m_sRef = dr.getString(2);
            product.m_sCode = dr.getString(3);
            product.m_sName = dr.getString(4);
            product.m_bCom = dr.getBoolean(5).booleanValue();
            product.m_bScale = dr.getBoolean(6).booleanValue();
            product.m_dPriceBuy = dr.getDouble(7).doubleValue();
            product.m_dPriceSell = dr.getDouble(8).doubleValue();
            product.taxcategoryid = dr.getString(9);
            product.categoryid = dr.getString(10);
            product.attributesetid = dr.getString(11);
            product.m_Image = ImageUtils.readImage(dr.getBytes(12));
            product.attributes = ImageUtils.readProperties(dr.getBytes(13));
            product.m_dPriceSell1 = dr.getDouble(14).doubleValue();
            product.m_dPriceSell2 = dr.getDouble(15).doubleValue();
            product.m_dPriceSell3 = dr.getDouble(16).doubleValue();
            product.m_dPriceSell4 = dr.getDouble(17).doubleValue();
            product.m_dPriceSell5 = dr.getDouble(18).doubleValue();
            product.m_dPriceSell6 = dr.getDouble(19).doubleValue();
            product.m_dPriceSell7 = dr.getDouble(20).doubleValue();
            product.m_dPriceSell8 = dr.getDouble(21).doubleValue();
            product.m_dPriceSell9 = dr.getDouble(22).doubleValue();
            product.m_dPriceSell10 = dr.getDouble(23).doubleValue();
            product.m_dPriceSell11 = dr.getDouble(24).doubleValue();
            product.m_dPriceSell12 = dr.getDouble(25).doubleValue();
            product.m_dPriceSell13 = dr.getDouble(26).doubleValue();
            product.m_dPriceSell14 = dr.getDouble(27).doubleValue();
            product.m_dPriceSell15 = dr.getDouble(28).doubleValue();
            product.m_dPriceSell16 = dr.getDouble(29).doubleValue();
            product.m_dPriceSell17 = dr.getDouble(30).doubleValue();
            product.m_dPriceSell18 = dr.getDouble(31).doubleValue();
            product.m_dPriceSell19 = dr.getDouble(32).doubleValue();
            product.m_dPriceSell20 = dr.getDouble(33).doubleValue();
            product.m_dPriceSell21 = dr.getDouble(34).doubleValue();
            product.m_dPriceSell22 = dr.getDouble(35).doubleValue();
            product.m_dPriceSell23 = dr.getDouble(36).doubleValue();
            product.m_dPriceSell24 = dr.getDouble(37).doubleValue();
            product.m_dPriceSell25 = dr.getDouble(38).doubleValue();
            product.m_dPriceSell26 = dr.getDouble(39).doubleValue();
            product.m_dPriceSell27 = dr.getDouble(40).doubleValue();
            product.m_dPriceSell28 = dr.getDouble(41).doubleValue();
            product.m_dPriceSell29 = dr.getDouble(42).doubleValue();
            product.m_dPriceSell30 = dr.getDouble(43).doubleValue();
            product.m_dPriceSell31 = dr.getDouble(44).doubleValue();
            product.m_dPriceSell32 = dr.getDouble(45).doubleValue();
            product.m_dPriceSell33 = dr.getDouble(46).doubleValue();
            product.m_dPriceSell34 = dr.getDouble(47).doubleValue();
            product.m_dPriceSell35 = dr.getDouble(48).doubleValue();
            product.m_dPriceSell36 = dr.getDouble(49).doubleValue();
            product.m_dPriceSell37 = dr.getDouble(50).doubleValue();
            product.m_dPriceSell38 = dr.getDouble(51).doubleValue();
            product.m_dPriceSell39 = dr.getDouble(52).doubleValue();
            product.m_dPriceSell40 = dr.getDouble(53).doubleValue();
            product.m_dPriceSell41 = dr.getDouble(54).doubleValue();
            product.m_dPriceSell42 = dr.getDouble(55).doubleValue();
            product.m_dPriceSell43 = dr.getDouble(56).doubleValue();
            
            product.m_dPriceBuy1 = dr.getDouble(57).doubleValue();
            product.m_dPriceBuy2 = dr.getDouble(58).doubleValue();
            product.m_dPriceBuy3 = dr.getDouble(59).doubleValue();
            product.m_dPriceBuy4 = dr.getDouble(60).doubleValue();
            product.m_dPriceBuy5 = dr.getDouble(61).doubleValue();
            product.m_dPriceBuy6 = dr.getDouble(62).doubleValue();
            product.m_dPriceBuy7 = dr.getDouble(63).doubleValue();
            product.m_dPriceBuy8 = dr.getDouble(64).doubleValue();
            product.m_dPriceBuy9 = dr.getDouble(65).doubleValue();
            product.m_dPriceBuy10 = dr.getDouble(66).doubleValue();
            product.m_dPriceBuy11 = dr.getDouble(67).doubleValue();
            product.m_dPriceBuy12 = dr.getDouble(68).doubleValue();
            product.m_dPriceBuy13 = dr.getDouble(69).doubleValue();
            product.m_dPriceBuy14 = dr.getDouble(70).doubleValue();
            product.m_dPriceBuy15 = dr.getDouble(71).doubleValue();
            product.m_dPriceBuy16 = dr.getDouble(72).doubleValue();
            product.m_dPriceBuy17 = dr.getDouble(73).doubleValue();
            product.m_dPriceBuy18 = dr.getDouble(74).doubleValue();
            product.m_dPriceBuy19 = dr.getDouble(75).doubleValue();
            product.m_dPriceBuy20 = dr.getDouble(76).doubleValue();
            product.m_dPriceBuy21 = dr.getDouble(77).doubleValue();
            product.m_dPriceBuy22 = dr.getDouble(78).doubleValue();
            
            product.m_dPriceBuy1S = dr.getDouble(79).doubleValue();
            product.m_dPriceBuy2S = dr.getDouble(80).doubleValue();
            product.m_dPriceBuy3S = dr.getDouble(81).doubleValue();
            product.m_dPriceBuy4S = dr.getDouble(82).doubleValue();
            product.m_dPriceBuy5S = dr.getDouble(83).doubleValue();
            product.m_dPriceBuy6S = dr.getDouble(84).doubleValue();
            product.m_dPriceBuy7S = dr.getDouble(85).doubleValue();
            product.m_dPriceBuy8S = dr.getDouble(86).doubleValue();
            product.m_dPriceBuy9S = dr.getDouble(87).doubleValue();
            product.m_dPriceBuy10S = dr.getDouble(88).doubleValue();
            product.m_dPriceBuy11S = dr.getDouble(89).doubleValue();
            product.m_dPriceBuy12S = dr.getDouble(90).doubleValue();
            product.m_dPriceBuy13S = dr.getDouble(91).doubleValue();
            product.m_dPriceBuy14S = dr.getDouble(92).doubleValue();
            product.m_dPriceBuy15S = dr.getDouble(93).doubleValue();
            product.m_dPriceBuy16S = dr.getDouble(94).doubleValue();
            product.m_dPriceBuy17S = dr.getDouble(95).doubleValue();
            product.m_dPriceBuy18S = dr.getDouble(96).doubleValue();
            product.m_dPriceBuy19S = dr.getDouble(97).doubleValue();
            product.m_dPriceBuy20S = dr.getDouble(98).doubleValue();
            product.m_dPriceBuy21S = dr.getDouble(99).doubleValue();
            product.m_dPriceBuy22S = dr.getDouble(100).doubleValue();
            return product;
        }};
    }

    @Override
    public final String toString() {
        return m_sRef + " - " + m_sName;
    }
}
