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
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class ProductsBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_ProductID = "ProductID";
    public final static String ATTR_ProductName = "ProductName";
    public final static String ATTR_SupplierID = "SupplierID";
    public final static String ATTR_CategoryID = "CategoryID";
    public final static String ATTR_QuantityPerUnit = "QuantityPerUnit";
    public final static String ATTR_UnitPrice = "UnitPrice";
    public final static String ATTR_UnitsInStock = "UnitsInStock";
    public final static String ATTR_UnitsOnOrder = "UnitsOnOrder";
    public final static String ATTR_ReorderLevel = "ReorderLevel";
    public final static String ATTR_Discontinued = "Discontinued";
    private final static String REL_Order_x0020_DetailsObjects = "FK:Products[ProductID]:Order_x0020_Details[ProductID]";
    private final static String REL_CategoryIDObject = "FK:Products[CategoryID]:Categories[CategoryID]";
    private final static String REL_SupplierIDObject = "FK:Products[SupplierID]:Suppliers[SupplierID]";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(Products.class);
            s_classInfo.setTableName("Products");
            s_classInfo.setUIDElements(new String[]{ATTR_ProductID});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ProductID);
                ai.setJavaName("ProductID");
                ai.setColumnName("ProductID");
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_ProductID);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ProductName);
                ai.setJavaName("ProductName");
                ai.setColumnName("ProductName");
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ProductName);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SupplierID);
                ai.setJavaName("SupplierID");
                ai.setColumnName("SupplierID");
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_SupplierID);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CategoryID);
                ai.setJavaName("CategoryID");
                ai.setColumnName("CategoryID");
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_CategoryID);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_QuantityPerUnit);
                ai.setJavaName("QuantityPerUnit");
                ai.setColumnName("QuantityPerUnit");
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_QuantityPerUnit);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_UnitPrice);
                ai.setJavaName("UnitPrice");
                ai.setColumnName("UnitPrice");
                ai.setAttributeClass(double.class);
                NumberValidator v = new NumberValidator(ATTR_UnitPrice);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_UnitsInStock);
                ai.setJavaName("UnitsInStock");
                ai.setColumnName("UnitsInStock");
                ai.setAttributeClass(short.class);
                NumberValidator v = new NumberValidator(ATTR_UnitsInStock);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_UnitsOnOrder);
                ai.setJavaName("UnitsOnOrder");
                ai.setColumnName("UnitsOnOrder");
                ai.setAttributeClass(short.class);
                NumberValidator v = new NumberValidator(ATTR_UnitsOnOrder);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ReorderLevel);
                ai.setJavaName("ReorderLevel");
                ai.setColumnName("ReorderLevel");
                ai.setAttributeClass(short.class);
                NumberValidator v = new NumberValidator(ATTR_ReorderLevel);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Discontinued);
                ai.setJavaName("Discontinued");
                ai.setColumnName("Discontinued");
                ai.setAttributeClass(short.class);
                NumberValidator v = new NumberValidator(ATTR_Discontinued);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                // relation Order_x0020_DetailsObjects (FK:Products[ProductID]:Order_x0020_Details[ProductID])
                RelationInfo_FK ri = new RelationInfo_FK(REL_Order_x0020_DetailsObjects);
                ri.setName("Order_x0020_DetailsObjects");
                ri.setLocalAttributes(new String[]{"ProductID"});
                ri.setLocalIsPK(true);
                ri.setRelatedClass(com.northwind.Order_x0020_Details.class);
                ri.setRelatedAttributes(new String[]{"ProductID"});
                ri.setRelatedIdentifier("FK:Order_x0020_Details[ProductID]:Products[ProductID]");
                ri.setLoadMethod("loadOrder_x0020_DetailsObjects");
                s_classInfo.addRelationInfo(ri);
            }
            {
                // relation CategoryIDObject (FK:Products[CategoryID]:Categories[CategoryID])
                RelationInfo_FK ri = new RelationInfo_FK(REL_CategoryIDObject);
                ri.setName("CategoryIDObject");
                ri.setLocalAttributes(new String[]{"CategoryID"});
                ri.setLocalIsPK(false);
                ri.setRelatedClass(com.northwind.Categories.class);
                ri.setRelatedAttributes(new String[]{"CategoryID"});
                ri.setRelatedIdentifier("FK:Categories[CategoryID]:Products[CategoryID]");
                ri.setLoadMethod("loadCategoryIDObject");
                s_classInfo.addRelationInfo(ri);
            }
            {
                // relation SupplierIDObject (FK:Products[SupplierID]:Suppliers[SupplierID])
                RelationInfo_FK ri = new RelationInfo_FK(REL_SupplierIDObject);
                ri.setName("SupplierIDObject");
                ri.setLocalAttributes(new String[]{"SupplierID"});
                ri.setLocalIsPK(false);
                ri.setRelatedClass(com.northwind.Suppliers.class);
                ri.setRelatedAttributes(new String[]{"SupplierID"});
                ri.setRelatedIdentifier("FK:Suppliers[SupplierID]:Products[SupplierID]");
                ri.setLoadMethod("loadSupplierIDObject");
                s_classInfo.addRelationInfo(ri);
            }
        }
        return s_classInfo;
    }

    public ProductsBase(BusObjectConfig config)
    {
        super(config);
    }

    public int getProductID()
    {
        return getIntProperty(ATTR_ProductID);
    }

    public void setProductID(int value)
    {
        setProperty(ATTR_ProductID, value, 0);
    }

    public String getProductName()
    {
        return getStringProperty(ATTR_ProductName);
    }

    public void setProductName(String value)
    {
        setProperty(ATTR_ProductName, value, 0);
    }

    public int getSupplierID()
    {
        return getIntProperty(ATTR_SupplierID);
    }

    public void setSupplierID(int value)
    {
        String[] relations = new String[]{REL_SupplierIDObject};
        this.updateSingleRelations(relations, false);
        setProperty(ATTR_SupplierID, value, 0);
        this.updateSingleRelations(relations, true);
    }

    public int getCategoryID()
    {
        return getIntProperty(ATTR_CategoryID);
    }

    public void setCategoryID(int value)
    {
        String[] relations = new String[]{REL_CategoryIDObject};
        this.updateSingleRelations(relations, false);
        setProperty(ATTR_CategoryID, value, 0);
        this.updateSingleRelations(relations, true);
    }

    public String getQuantityPerUnit()
    {
        return getStringProperty(ATTR_QuantityPerUnit);
    }

    public void setQuantityPerUnit(String value)
    {
        setProperty(ATTR_QuantityPerUnit, value, 0);
    }

    public double getUnitPrice()
    {
        return getDoubleProperty(ATTR_UnitPrice);
    }

    public void setUnitPrice(double value)
    {
        setProperty(ATTR_UnitPrice, value, 0);
    }

    public short getUnitsInStock()
    {
        return getShortProperty(ATTR_UnitsInStock);
    }

    public void setUnitsInStock(short value)
    {
        setProperty(ATTR_UnitsInStock, value, 0);
    }

    public short getUnitsOnOrder()
    {
        return getShortProperty(ATTR_UnitsOnOrder);
    }

    public void setUnitsOnOrder(short value)
    {
        setProperty(ATTR_UnitsOnOrder, value, 0);
    }

    public short getReorderLevel()
    {
        return getShortProperty(ATTR_ReorderLevel);
    }

    public void setReorderLevel(short value)
    {
        setProperty(ATTR_ReorderLevel, value, 0);
    }

    public short getDiscontinued()
    {
        return getShortProperty(ATTR_Discontinued);
    }

    public void setDiscontinued(short value)
    {
        setProperty(ATTR_Discontinued, value, 0);
    }

    public BusObjectIterator<Order_x0020_Details> getOrder_x0020_DetailsObjects()
    {
        return getMultiRelationObjects(REL_Order_x0020_DetailsObjects);
    }
    public BusObjectIterator<Order_x0020_Details> loadOrder_x0020_DetailsObjects()
    {
        String queryText = "select * from \"Order Details\" where \"ProductID\" = :ProductID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ProductID", "Order Details.ProductID", QueryObject.PARAM_INT, new Integer(getProductID()));
        query.setResultClass(Order_x0020_Details.class);
        return query.getObjects();
    }


    public void addOrder_x0020_DetailsObject(Order_x0020_Details a_Order_x0020_Details)
    {
        a_Order_x0020_Details.setProductID(this.getProductID());
    }

    public void removeOrder_x0020_DetailsObject(Order_x0020_Details a_Order_x0020_Details)
    {
        a_Order_x0020_Details.setNull("ProductID");
    }

    public Categories getCategoryIDObject()
    {
        return (Categories)getSingleRelationObject(REL_CategoryIDObject);
    }
    public Categories loadCategoryIDObject()
    {
        String queryText = "select * from \"Categories\" where \"CategoryID\" = :CategoryID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CategoryID", "Categories.CategoryID", QueryObject.PARAM_INT, new Integer(getCategoryID()));
        query.setResultClass(Categories.class);
        return (Categories)query.getObject();
    }


    public void setCategoryIDObject(Categories a_Categories)
    {
        if (a_Categories == null)
        {
            this.setNull("CategoryID");
        }
        else
        {
            this.setCategoryID(a_Categories.getCategoryID());
        }
    }

    public Suppliers getSupplierIDObject()
    {
        return (Suppliers)getSingleRelationObject(REL_SupplierIDObject);
    }
    public Suppliers loadSupplierIDObject()
    {
        String queryText = "select * from \"Suppliers\" where \"SupplierID\" = :SupplierID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SupplierID", "Suppliers.SupplierID", QueryObject.PARAM_INT, new Integer(getSupplierID()));
        query.setResultClass(Suppliers.class);
        return (Suppliers)query.getObject();
    }


    public void setSupplierIDObject(Suppliers a_Suppliers)
    {
        if (a_Suppliers == null)
        {
            this.setNull("SupplierID");
        }
        else
        {
            this.setSupplierID(a_Suppliers.getSupplierID());
        }
    }

    public void setNull(String element)
    {
        super.setNull(element);
        if (ATTR_SupplierID.equals(element))
        {
            this.updateSingleRelation(REL_SupplierIDObject, false);
        }
        else if (ATTR_CategoryID.equals(element))
        {
            this.updateSingleRelation(REL_CategoryIDObject, false);
        }
    }
    public static BusObjectIterator<com.northwind.Products> getNextProductsObjects(int ProductID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"Products\" where (\"ProductID\" > :ProductID) order by \"ProductID\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ProductID", "Products.ProductID", QueryObject.PARAM_INT, new Integer(ProductID));
        query.setResultClass(Products.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.northwind.Products> getPreviousProductsObjects(int ProductID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"Products\" where (\"ProductID\" < :ProductID) order by \"ProductID\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ProductID", "Products.ProductID", QueryObject.PARAM_INT, new Integer(ProductID));
        query.setResultClass(Products.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.northwind.Products getProductsObject(int ProductID)
    {
        String queryText = "select * from \"Products\" where \"ProductID\" = :ProductID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("ProductID", "Products.ProductID", QueryObject.PARAM_INT, new Integer(ProductID));
        query.setResultClass(Products.class);
        return (Products)query.getObject();
    }

    public static BusObjectIterator<com.northwind.Products> getProductsObjects(int fromProductID, int toProductID, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"Products\" where \"ProductID\" between :fromProductID and :toProductID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromProductID", "Products.ProductID", QueryObject.PARAM_INT, new Integer(fromProductID));
        query.addParameter("toProductID", "Products.ProductID", QueryObject.PARAM_INT, new Integer(toProductID));
        query.setResultClass(Products.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.northwind.Products> getProductsObjects(int fromProductID, int toProductID)
    {
        String queryText = "select * from \"Products\" where \"ProductID\" between :fromProductID and :toProductID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromProductID", "Products.ProductID", QueryObject.PARAM_INT, new Integer(fromProductID));
        query.addParameter("toProductID", "Products.ProductID", QueryObject.PARAM_INT, new Integer(toProductID));
        query.setResultClass(Products.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.northwind.Products> getProductsObjectsForCategoryID(int CategoryID)
    {
        String queryText = "select * from \"Products\" where \"CategoryID\" = :CategoryID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("CategoryID", "Products.CategoryID", QueryObject.PARAM_INT, new Integer(CategoryID));
        query.setResultClass(Products.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.northwind.Products> getProductsObjectsForSupplierID(int SupplierID)
    {
        String queryText = "select * from \"Products\" where \"SupplierID\" = :SupplierID";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SupplierID", "Products.SupplierID", QueryObject.PARAM_INT, new Integer(SupplierID));
        query.setResultClass(Products.class);
        return query.getObjects();
    }

}
