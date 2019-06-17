/*
 * Copyright 2013 Artur Mkrtchyan
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
package org.iban4j.bban;

import org.iban4j.CountryCode;

import java.util.*;


/**
 * Class which represents bban structure
 */
public class BbanStructure {

    private final BbanStructureEntry[] entries;

    private BbanStructure(final BbanStructureEntry... entries) {
        this.entries = entries;
    }

    private static final EnumMap<CountryCode, List<BbanStructure>> structures;

    static {
        structures = new EnumMap<CountryCode, List<BbanStructure>>(CountryCode.class);

        structures.put(CountryCode.AL,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.branchCode(4, 'n'),
                        BbanStructureEntry.nationalCheckDigit(1, 'n'),
                        BbanStructureEntry.accountNumber(16, 'c'))));

        structures.put(CountryCode.AD,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'n'),
                        BbanStructureEntry.branchCode(4, 'n'),
                        BbanStructureEntry.accountNumber(12, 'c'))));

        structures.put(CountryCode.AT,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(5, 'n'),
                        BbanStructureEntry.accountNumber(11, 'n'))));


        structures.put(CountryCode.AZ,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.accountNumber(20, 'c'))));

        structures.put(CountryCode.BH,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.accountNumber(14, 'c'))));

        structures.put(CountryCode.BE,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.accountNumber(7, 'n'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'))));

        structures.put(CountryCode.BA,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.branchCode(3, 'n'),
                        BbanStructureEntry.accountNumber(8, 'n'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'))));

        structures.put(CountryCode.BR,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(8, 'n'),
                        BbanStructureEntry.branchCode(5, 'n'),
                        BbanStructureEntry.accountNumber(10, 'n'),
                        BbanStructureEntry.accountType(1, 'a'),
                        BbanStructureEntry.ownerAccountNumber(1, 'c'))));

        structures.put(CountryCode.BG,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.branchCode(4, 'n'),
                        BbanStructureEntry.accountType(2, 'n'),
                        BbanStructureEntry.accountNumber(8, 'c'))));

        structures.put(CountryCode.CR,
                Arrays.asList(new BbanStructure(
                                BbanStructureEntry.reserveNumber(1, 'n'),
                                BbanStructureEntry.bankCode(3, 'n'),
                                BbanStructureEntry.accountNumber(14, 'n')),
                        new BbanStructure(
                                BbanStructureEntry.bankCode(3, 'n'),
                                BbanStructureEntry.accountNumber(14, 'n'))));

        structures.put(CountryCode.DE,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(8, 'n'),
                        BbanStructureEntry.accountNumber(10, 'n'))));

        structures.put(CountryCode.HR,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(7, 'n'),
                        BbanStructureEntry.accountNumber(10, 'n'))));

        structures.put(CountryCode.CY,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.branchCode(5, 'n'),
                        BbanStructureEntry.accountNumber(16, 'c'))));

        structures.put(CountryCode.CZ,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'n'),
                        BbanStructureEntry.accountNumber(16, 'n'))));

        structures.put(CountryCode.DK,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'n'),
                        BbanStructureEntry.accountNumber(10, 'n'))));

        structures.put(CountryCode.DO,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'c'),
                        BbanStructureEntry.accountNumber(20, 'n'))));

        structures.put(CountryCode.EE,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(2, 'n'),
                        BbanStructureEntry.branchCode(2, 'n'),
                        BbanStructureEntry.accountNumber(11, 'n'),
                        BbanStructureEntry.nationalCheckDigit(1, 'n'))));

        structures.put(CountryCode.FO,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'n'),
                        BbanStructureEntry.accountNumber(9, 'n'),
                        BbanStructureEntry.nationalCheckDigit(1, 'n'))));

        structures.put(CountryCode.FI,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(6, 'n'),
                        BbanStructureEntry.accountNumber(7, 'n'),
                        BbanStructureEntry.nationalCheckDigit(1, 'n'))));

        structures.put(CountryCode.FR,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(5, 'n'),
                        BbanStructureEntry.branchCode(5, 'n'),
                        BbanStructureEntry.accountNumber(11, 'c'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'))));

        structures.put(CountryCode.GE,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(2, 'a'),
                        BbanStructureEntry.accountNumber(16, 'n'))));

        structures.put(CountryCode.GI,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.accountNumber(15, 'c'))));

        structures.put(CountryCode.GL,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'n'),
                        BbanStructureEntry.accountNumber(10, 'n'))));

        structures.put(CountryCode.GR,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.branchCode(4, 'n'),
                        BbanStructureEntry.accountNumber(16, 'c'))));

        structures.put(CountryCode.GT,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'c'),
                        BbanStructureEntry.accountNumber(20, 'c'))));

        structures.put(CountryCode.HU,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.branchCode(4, 'n'),
                        BbanStructureEntry.accountNumber(16, 'n'),
                        BbanStructureEntry.nationalCheckDigit(1, 'n'))));

        structures.put(CountryCode.IS,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'n'),
                        BbanStructureEntry.branchCode(2, 'n'),
                        BbanStructureEntry.accountNumber(6, 'n'),
                        BbanStructureEntry.identificationNumber(10, 'n'))));

        structures.put(CountryCode.IE,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.branchCode(6, 'n'),
                        BbanStructureEntry.accountNumber(8, 'n'))));

        structures.put(CountryCode.IL,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.branchCode(3, 'n'),
                        BbanStructureEntry.accountNumber(13, 'n'))));

        structures.put(CountryCode.IR,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.accountNumber(19, 'n'))));

        structures.put(CountryCode.IT,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.nationalCheckDigit(1, 'a'),
                        BbanStructureEntry.bankCode(5, 'n'),
                        BbanStructureEntry.branchCode(5, 'n'),
                        BbanStructureEntry.accountNumber(12, 'c'))));

        structures.put(CountryCode.JO,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.branchCode(4, 'n'),
                        BbanStructureEntry.accountNumber(18, 'c'))));

        structures.put(CountryCode.KZ,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.accountNumber(13, 'c'))));

        structures.put(CountryCode.KW,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.accountNumber(22, 'c'))));

        structures.put(CountryCode.LV,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.accountNumber(13, 'c'))));

        structures.put(CountryCode.LB,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'n'),
                        BbanStructureEntry.accountNumber(20, 'c'))));

        structures.put(CountryCode.LI,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(5, 'n'),
                        BbanStructureEntry.accountNumber(12, 'c'))));

        structures.put(CountryCode.LT,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(5, 'n'),
                        BbanStructureEntry.accountNumber(11, 'n'))));

        structures.put(CountryCode.LU,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.accountNumber(13, 'c'))));

        structures.put(CountryCode.MK,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.accountNumber(10, 'c'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'))));

        structures.put(CountryCode.MT,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.branchCode(5, 'n'),
                        BbanStructureEntry.accountNumber(18, 'c'))));

        structures.put(CountryCode.MR,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(5, 'n'),
                        BbanStructureEntry.branchCode(5, 'n'),
                        BbanStructureEntry.accountNumber(11, 'n'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'))));

        structures.put(CountryCode.MU,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(6, 'c'),
                        BbanStructureEntry.branchCode(2, 'n'),
                        BbanStructureEntry.accountNumber(18, 'c'))));

        structures.put(CountryCode.MD,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(2, 'c'),
                        BbanStructureEntry.accountNumber(18, 'c'))));

        structures.put(CountryCode.MC,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(5, 'n'),
                        BbanStructureEntry.branchCode(5, 'n'),
                        BbanStructureEntry.accountNumber(11, 'c'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'))));

        structures.put(CountryCode.ME,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.accountNumber(13, 'n'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'))));

        structures.put(CountryCode.NL,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.accountNumber(10, 'n'))));

        structures.put(CountryCode.NO,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'n'),
                        BbanStructureEntry.accountNumber(6, 'n'),
                        BbanStructureEntry.nationalCheckDigit(1, 'n'))));

        structures.put(CountryCode.PK,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'c'),
                        BbanStructureEntry.accountNumber(16, 'n'))));

        structures.put(CountryCode.PS,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.accountNumber(21, 'c'))));

        structures.put(CountryCode.PL,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.branchCode(4, 'n'),
                        BbanStructureEntry.nationalCheckDigit(1, 'n'),
                        BbanStructureEntry.accountNumber(16, 'n'))));

        structures.put(CountryCode.PT,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'n'),
                        BbanStructureEntry.branchCode(4, 'n'),
                        BbanStructureEntry.accountNumber(11, 'n'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'))));

        structures.put(CountryCode.RO,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.accountNumber(16, 'c'))));

        structures.put(CountryCode.QA,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.accountNumber(21, 'c'))));

        structures.put(CountryCode.SM,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.nationalCheckDigit(1, 'a'),
                        BbanStructureEntry.bankCode(5, 'n'),
                        BbanStructureEntry.branchCode(5, 'n'),
                        BbanStructureEntry.accountNumber(12, 'c'))));

        structures.put(CountryCode.SA,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(2, 'n'),
                        BbanStructureEntry.accountNumber(18, 'c'))));

        structures.put(CountryCode.RS,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.accountNumber(13, 'n'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'))));

        structures.put(CountryCode.SK,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'n'),
                        BbanStructureEntry.accountNumber(16, 'n'))));

        structures.put(CountryCode.SI,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(2, 'n'),
                        BbanStructureEntry.branchCode(3, 'n'),
                        BbanStructureEntry.accountNumber(8, 'n'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'))));

        structures.put(CountryCode.ES,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'n'),
                        BbanStructureEntry.branchCode(4, 'n'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'),
                        BbanStructureEntry.accountNumber(10, 'n'))));

        structures.put(CountryCode.SE,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.accountNumber(17, 'n'))));

        structures.put(CountryCode.CH,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(5, 'n'),
                        BbanStructureEntry.accountNumber(12, 'c'))));

        structures.put(CountryCode.TN,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(2, 'n'),
                        BbanStructureEntry.branchCode(3, 'n'),
                        BbanStructureEntry.accountNumber(15, 'c'))));

        structures.put(CountryCode.TR,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(5, 'n'),
                        BbanStructureEntry.nationalCheckDigit(1, 'c'),
                        BbanStructureEntry.accountNumber(16, 'c'))));

        structures.put(CountryCode.UA,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(6, 'n'),
                        BbanStructureEntry.accountNumber(19, 'n'))));

        structures.put(CountryCode.GB,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.branchCode(6, 'n'),
                        BbanStructureEntry.accountNumber(8, 'n'))));

        structures.put(CountryCode.AE,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.accountNumber(16, 'c'))));

        structures.put(CountryCode.VG,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'c'),
                        BbanStructureEntry.accountNumber(16, 'n'))));

        structures.put(CountryCode.TL,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(3, 'n'),
                        BbanStructureEntry.accountNumber(14, 'n'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'))));

        structures.put(CountryCode.XK,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(2, 'n'),
                        BbanStructureEntry.branchCode(2, 'n'),
                        BbanStructureEntry.accountNumber(10, 'n'),
                        BbanStructureEntry.nationalCheckDigit(2, 'n'))));

        structures.put(CountryCode.BY,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'c'),
                        BbanStructureEntry.branchCode(4, 'n'),
                        BbanStructureEntry.accountNumber(16, 'c'))));

        structures.put(CountryCode.SV,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.accountNumber(20, 'n'))));

        structures.put(CountryCode.IQ,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.branchCode(3, 'n'),
                        BbanStructureEntry.accountNumber(12, 'n'))));

        structures.put(CountryCode.LC,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.accountNumber(24, 'n'))));

        structures.put(CountryCode.ST,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'n'),
                        BbanStructureEntry.branchCode(4, 'n'),
                        BbanStructureEntry.accountNumber(13, 'n'))));

        structures.put(CountryCode.SC,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(4, 'a'),
                        BbanStructureEntry.branchCode(4, 'n'),
                        BbanStructureEntry.accountNumber(16, 'n'),
                        BbanStructureEntry.currency(3, 'a'))));

        structures.put(CountryCode.DZ,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(20, 'n'))));

        structures.put(CountryCode.AO,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(21, 'n'))));

        structures.put(CountryCode.BJ,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(1, 'a'),
                        BbanStructureEntry.accountNumber(23, 'n'))));

        structures.put(CountryCode.BF,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(23, 'n'))));

        structures.put(CountryCode.BI,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(12, 'n'))));

        structures.put(CountryCode.CM,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(23, 'n'))));

        structures.put(CountryCode.CV,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(21, 'n'))));

        structures.put(CountryCode.CG,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(23, 'n'))));

        structures.put(CountryCode.CI,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.bankCode(1, 'a'),
                        BbanStructureEntry.accountNumber(23, 'n'))));

        structures.put(CountryCode.EG,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(23, 'n'))));

        structures.put(CountryCode.GA,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(23, 'n'))));

        structures.put(CountryCode.MG,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(23, 'n'))));

        structures.put(CountryCode.ML,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(1, 'a'),
                        BbanStructureEntry.accountNumber(23, 'n'))));

        structures.put(CountryCode.MZ,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(21, 'n'))));

        structures.put(CountryCode.SN,
                Collections.singletonList(new BbanStructure(
                        BbanStructureEntry.accountNumber(1, 'a'),
                        BbanStructureEntry.accountNumber(23, 'n'))));

    }

    /**
     * @param countryCode the country code.
     * @return BbanStructure for specified country or null if country is not supported.
     */
    public static BbanStructure forCountry(final CountryCode countryCode) {
        // TODO: 2019-06-17 return a list of structures
        return structures.get(countryCode).get(0);
    }

    public List<BbanStructureEntry> getEntries() {
        return Collections.unmodifiableList(Arrays.asList(entries));
    }

    public static List<CountryCode> supportedCountries() {
        final List<CountryCode> countryCodes = new ArrayList<CountryCode>(structures.size());
        countryCodes.addAll(structures.keySet());
        return Collections.unmodifiableList(countryCodes);
    }

    /**
     * Returns the length of bban.
     *
     * @return int length
     */
    public int getBbanLength() {
        int length = 0;

        for (BbanStructureEntry entry : entries) {
            length += entry.getLength();
        }

        return length;
    }
}
