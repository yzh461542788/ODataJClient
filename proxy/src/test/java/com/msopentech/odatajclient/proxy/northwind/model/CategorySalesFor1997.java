/*
 * Copyright 2013 MS OpenTech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.msopentech.odatajclient.proxy.northwind.model;

import com.msopentech.odatajclient.proxy.meta.EntityType;
import com.msopentech.odatajclient.proxy.meta.Key;
import com.msopentech.odatajclient.proxy.meta.Property;
import java.io.Serializable;

@EntityType("Category_Sales_for_1997")
public class CategorySalesFor1997 implements Serializable {

    private static final long serialVersionUID = -3788843367707701L;

    @Key
    @Property(name = "CategoryName", type = "Edm.String", nullable = false)
    private String categoryName;

    @Property(name = "CategorySales", type = "Edm.Decimal", nullable = true)
    private Float categorySales;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Float getCategorySales() {
        return categorySales;
    }

    public void setCategorySales(Float categorySales) {
        this.categorySales = categorySales;
    }
}