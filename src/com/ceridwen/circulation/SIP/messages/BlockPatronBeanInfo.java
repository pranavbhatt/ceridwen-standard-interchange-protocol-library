/*******************************************************************************
 * Copyright (c) 2010 Matthew J. Dovey.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * <http://www.gnu.org/licenses/>.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Matthew J. Dovey - initial API and implementation
 ******************************************************************************/
package com.ceridwen.circulation.SIP.messages;

import java.beans.*;

import com.ceridwen.circulation.SIP.types.descriptors.PositionedFieldDescriptor;
import com.ceridwen.circulation.SIP.types.descriptors.TaggedFieldDescriptor;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class BlockPatronBeanInfo extends MessageBeanInfo {
  Class<BlockPatron> beanClass = BlockPatron.class;

  public BlockPatronBeanInfo() {
  }

  public PropertyDescriptor[] getPropertyDescriptorsInternal() throws IntrospectionException {
	  PropertyDescriptor _cardRetained = new PropertyDescriptor("cardRetained", beanClass, "getCardRetained", "setCardRetained");
	  PropertyDescriptor _transactionDate = new PropertyDescriptor("transactionDate", beanClass, "getTransactionDate", "setTransactionDate");
	  PropertyDescriptor _institutionId = new PropertyDescriptor("institutionId", beanClass, "getInstitutionId", "setInstitutionId");
	  PropertyDescriptor _blockedCardMessage = new PropertyDescriptor("blockedCardMessage", beanClass, "getBlockedCardMessage", "setBlockedCardMessage");
	  PropertyDescriptor _patronIdentifier = new PropertyDescriptor("patronIdentifier", beanClass, "getPatronIdentifier", "setPatronIdentifier");
	  PropertyDescriptor _terminalPassword = new PropertyDescriptor("terminalPassword", beanClass, "getTerminalPassword", "setTerminalPassword");
	
	  _cardRetained.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(2,2));
	  _transactionDate.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(3,20));

      _patronIdentifier.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(true));
      _terminalPassword.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(true));      	  
	
	  PropertyDescriptor[] pds = new PropertyDescriptor[] {
	    _cardRetained,
	    _transactionDate,
	    _institutionId,
	    _blockedCardMessage,
	    _patronIdentifier,
	    _terminalPassword};
	  return pds;
  }
}
