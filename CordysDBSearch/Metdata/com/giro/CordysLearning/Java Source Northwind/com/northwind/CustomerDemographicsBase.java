/*
  This class has been generated by the Code Generator
*/

package com.northwind;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.classinfo.RelationInfo_FK;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class CustomerDemographicsBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_CustomerTypeID = "CustomerTypeID";
    public final static String ATTR_CustomerDesc = "CustomerDesc";
    private final static String REL_CustomerCustomerDemoObjects = "FK:CustomerDemographics[CustomerTypeID]:CustomerCustomerDemo[CustomerTypeID]";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(CustomerDemographics.class);
            s_classInfo.setTableName("CustomerDemographics");
            s_classInfo.setUIDElements(new String[]{ATTR_CustomerTypeID});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CustomerTypeID);
                ai.setJavaName("CustomerTypeID");
                ai.setColumnName("CustomerTypeID");
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CustomerTypeID);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CustomerDesc);
                ai.setJavaName("CustomerDesc");
                ai.setColumnName("CustomerDesc");
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CustomerDesc);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                // relation CustomerCustomerDemoObjects (FK:CustomerDemographics[CustomerTypeID]:CustomerCustomerDemo[CustomerTypeID])
                RelationInfo_FK ri = new RelationInfo_FK(REL_CustomerCustomerDemoObjects);
                ri.setName("CustomerCustomerDemoObjects");
                ri.setLocalAttributes(new String[]{"CustomerTypeID"});
                ri.setLocalIsPK(true);
                ri.setRelatedClass(com.northwind.CustomerCustomerDemo.class);
                ri.setRelatedAttributes(new String[]{"CustomerTypeID"});
                ri.setRelatedIdentifier("FK:CustomerCustomerDemo[CustomerTypeID]:CustomerDemographics[CustomerTypeID]");
                ri.setLoadMethod("loadCustomerCustomerDemoObjects");
                s_classInfo.addRelationInfo(ri);
            }
        }
        return s_classInfo;
    }

    public CustomerDemographicsBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getCustomerTypeID()
    {
        return getStringProperty(ATTR_CustomerTypeID);
    }

    public void setCustomerTypeID(String value)
    {
        setProperty(ATTR_CustomerTypeID, value, 0);
    }

    public String getCustomerDesc()
    {
        return getStringProperty(ATTR_CustomerDesc);
    }

    public void setCustomerDesc(String value)
    {
        setProperty(ATTR_CustomerDesc, value, 0);
    }

    public BusObjectIterator<CustomerCustomerDemo> getCustomerCustomerDemoObjects()
    {
        return getMultiRelationObjects(REL_CustomerCustomerDemoObjects);
    }
    public BusObjectIterator<CustomerCustomerDemo> loadCustomerCustomerDemoObjects()
    {
        String queryText = "select * from \"CustomerCustomerDemo\" where \"CustomerTypeID\" = :CustomerTypeID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CustomerTypeID", "CustomerCustomerDemo.CustomerTypeID", QueryObject.PARAM_STRING, getCustomerTypeID());
        query.setResultClass(CustomerCustomerDemo.class);
        return query.getObjects();
    }


    public void addCustomerCustomerDemoObject(CustomerCustomerDemo a_CustomerCustomerDemo)
    {
        a_CustomerCustomerDemo.setCustomerTypeID(this.getCustomerTypeID());
    }

    public void removeCustomerCustomerDemoObject(CustomerCustomerDemo a_CustomerCustomerDemo)
    {
        a_CustomerCustomerDemo.setNull("CustomerTypeID");
    }

    public static com.northwind.CustomerDemographics getCustomerDemographicsObject(String CustomerTypeID)
    {
        String queryText = "select * from \"CustomerDemographics\" where \"CustomerTypeID\" = :CustomerTypeID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CustomerTypeID", "CustomerDemographics.CustomerTypeID", QueryObject.PARAM_STRING, CustomerTypeID);
        query.setResultClass(CustomerDemographics.class);
        return (CustomerDemographics)query.getObject();
    }

    public static BusObjectIterator<com.northwind.CustomerDemographics> getCustomerDemographicsObjects(String fromCustomerTypeID, String toCustomerTypeID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"CustomerDemographics\" where \"CustomerTypeID\" between :fromCustomerTypeID and :toCustomerTypeID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromCustomerTypeID", "CustomerDemographics.CustomerTypeID", QueryObject.PARAM_STRING, fromCustomerTypeID);
        query.addParameter("toCustomerTypeID", "CustomerDemographics.CustomerTypeID", QueryObject.PARAM_STRING, toCustomerTypeID);
        query.setResultClass(CustomerDemographics.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.northwind.CustomerDemographics> getCustomerDemographicsObjects(String fromCustomerTypeID, String toCustomerTypeID)
    {
        String queryText = "select * from \"CustomerDemographics\" where \"CustomerTypeID\" between :fromCustomerTypeID and :toCustomerTypeID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromCustomerTypeID", "CustomerDemographics.CustomerTypeID", QueryObject.PARAM_STRING, fromCustomerTypeID);
        query.addParameter("toCustomerTypeID", "CustomerDemographics.CustomerTypeID", QueryObject.PARAM_STRING, toCustomerTypeID);
        query.setResultClass(CustomerDemographics.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.northwind.CustomerDemographics> getNextCustomerDemographicsObjects(String CustomerTypeID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"CustomerDemographics\" where (\"CustomerTypeID\" > :CustomerTypeID) order by \"CustomerTypeID\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CustomerTypeID", "CustomerDemographics.CustomerTypeID", QueryObject.PARAM_STRING, CustomerTypeID);
        query.setResultClass(CustomerDemographics.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.northwind.CustomerDemographics> getPreviousCustomerDemographicsObjects(String CustomerTypeID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"CustomerDemographics\" where (\"CustomerTypeID\" < :CustomerTypeID) order by \"CustomerTypeID\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CustomerTypeID", "CustomerDemographics.CustomerTypeID", QueryObject.PARAM_STRING, CustomerTypeID);
        query.setResultClass(CustomerDemographics.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

}
