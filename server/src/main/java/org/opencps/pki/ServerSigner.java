/**
* OpenCPS PKI is the open source PKI Integration software
* Copyright (C) 2016-present OpenCPS community

* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* any later version.

* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero General Public License for more details.
* You should have received a copy of the GNU Affero General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>
*/
package org.opencps.pki;

import java.security.cert.Certificate;

/**
 * Server signer interface
 *
 * This interface class defines the standard functions that any
 * server signer needs to define.
 *
 * @author Nguyen Van Nguyen <nguyennv@iwayvietnam.com>
 */
public interface ServerSigner {
    public Certificate readCertificate(byte[] cert);
    
    public Boolean validateCertificate(Certificate cert);

    public byte[] computeHash();
    
    public String getHashAlgorithm();
    
    public String sign(byte[] signature);

    public String sign(byte[] signature, String filePath);
}
