package com.google.bitcoin.bouncycastle.crypto.params;

import java.security.SecureRandom;

import com.google.bitcoin.bouncycastle.crypto.KeyGenerationParameters;

public class DSAKeyGenerationParameters
    extends KeyGenerationParameters
{
    private DSAParameters    params;

    public DSAKeyGenerationParameters(
        SecureRandom    random,
        DSAParameters   params)
    {
        super(random, params.getP().bitLength() - 1);

        this.params = params;
    }

    public DSAParameters getParameters()
    {
        return params;
    }
}
