/*
    Copyright 2009 Lunatech Research
    
    This file is part of jax-doclets.

    jax-doclets is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    jax-doclets is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with jax-doclets.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.lunatech.doclets.jax.jpa.writers;

import com.lunatech.doclets.jax.JAXConfiguration;
import com.lunatech.doclets.jax.jpa.model.JPAClass;
import com.sun.tools.doclets.formats.html.HtmlDocletWriter;

public class DocletWriter extends com.lunatech.doclets.jax.writers.DocletWriter {

  protected JPAClass jpaClass;

  public DocletWriter(JAXConfiguration configuration, HtmlDocletWriter writer, JPAClass jpaClass) {
    super(configuration, writer);
    this.jpaClass = jpaClass;
  }

  public JPAClass getJPAClass() {
    return jpaClass;
  }

}
