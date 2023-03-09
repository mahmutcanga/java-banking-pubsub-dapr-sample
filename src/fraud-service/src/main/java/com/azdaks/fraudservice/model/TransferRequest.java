package com.azdaks.fraudservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Jacksonized
public class TransferRequest {
    private String sender;
    private String receiver;
    private double amount;

    public String toString() {
        return "Sender: " + sender + ", Receiver: " + receiver + ", Amount: " + amount;
    }
}