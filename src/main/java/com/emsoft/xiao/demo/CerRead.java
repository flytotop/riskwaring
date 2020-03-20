package com.emsoft.xiao.demo;

import cn.hutool.crypto.SmUtil;
import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/**
 * @Auther: xhf
 * @Date: 2020-02-12 09:42
 * @Description:
 */
public class CerRead {
    public static void main(String[] args) throws FileNotFoundException, CertificateException {
//        CertificateFactory cf = CertificateFactory.getInstance("X.509");
//        X509Certificate cert = (X509Certificate)cf.generateCertificate(new FileInputStream("/Users/xiaohanfeng/Documents/111.cer"));
//        PublicKey publicKey = cert.getPublicKey();
//        BASE64Encoder base64Encoder=new BASE64Encoder();
//        String publicKeyString = base64Encoder.encode(publicKey.getEncoded());
//        System.out.println("-----------------公钥--------------------");
//        System.out.println(publicKeyString);
//        System.out.println("-----------------公钥--------------------");

        String a=SmUtil.sm3("肖涵峰"+"2605247733981747").toUpperCase();
        System.out.println(a);

    }

}
