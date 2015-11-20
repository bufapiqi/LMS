package main;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiService.account.accountFactoryImpl;
import rmiService.documents.documentsFactoryImpl;
import rmiService.finance.financeFactoryImpl;
import rmiService.organization.organizationFactoryImpl;
import rmiService.storage.storageFactoryImpl;
import rmiService.transportation.TransportationFactoryImpl;
import dataservice.accountdataservice.accountFactory;
import dataservice.documentsdataservice.documentsFactory;
import dataservice.financedataservice.financeFactory;
import dataservice.organizationdataservice.organizationFactory;
import dataservice.storagedataservice.storageFactory;
import dataservice.transportationdataservice.TransportationFactory;

public class launch {
	public static void main(String[] args){
		try{
			financeFactory finFactory = new financeFactoryImpl();
			//����������Ա�Ĺ���
			storageFactory stoFactory = new storageFactoryImpl();
			//������ת���Ĳֿ����Ա�Ĺ���
			accountFactory accFactory = new accountFactoryImpl();
			//��������Ա�Ĺ���
			documentsFactory docFactory = new documentsFactoryImpl();
			//�������ݹ���
			organizationFactory orgFactory = new organizationFactoryImpl();
			//������������
			TransportationFactory traFactory = new TransportationFactoryImpl();
			//������������
			Registry registry =creatRegistry(6600);
			
			registry.rebind("finFactory", finFactory);
			System.out.println("������ע����finance����");
			//������finance�ӿ�rmi��ͨ��
			registry.rebind("stoFactory", stoFactory);
			System.out.println("������ע����storage����");
			//������storage�ӿ�rmi��ͨ��
			registry.rebind("accFactory", accFactory);
			System.out.println("������ע����account����");
			//������account�ӿ�rmi��ͨ��
			registry.rebind("docFactory", docFactory);
			System.out.println("������ע����docFactory����");
			//������documents�ӿ�rmi��ͨ��
			registry.rebind("orgFactory", orgFactory);
			System.out.println("������ע����orgFactory����");
			//������organization�ӿ�rmi��ͨ��
			registry.rebind("traFactory", traFactory);
			System.out.println("������ע����traFactory����");
			//������transportation�ӿ�rmi��ͨ��
			
			System.out.println("Service Start");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	private static Registry creatRegistry(int port){
		Registry registry = null;
		
		try{
			registry = LocateRegistry.getRegistry(port);//����ö˿�δ��ע�ᣬ�����쳣 
			registry.list();//�õ��ö˿�ע���rmi���� 
		}catch (final Exception e){
			try{
				registry = LocateRegistry.createRegistry(port);
			}catch (final Exception ee){
				ee.printStackTrace();
			}
		}
		return registry;
	}
}
