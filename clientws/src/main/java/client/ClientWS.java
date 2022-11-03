package client;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.sql.SQLOutput;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy=new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(9000));
        Compte compte=proxy.getCompte(9);
        System.out.println("..........................");
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
        List<Compte> comptes=proxy.listCompte();
        comptes.forEach(cp->{
            System.out.println("......................");
            System.out.println(cp.getCode());
            System.out.println(cp.getSolde());
        });
    }
}
