/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.EncryptionAlgorithms;

/**
 *
 * @author Octavian
 */
public abstract class RootEncryption {
    public abstract String encrypt(String word);
    public abstract String getKey();
}
