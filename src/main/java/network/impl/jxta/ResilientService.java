package network.impl.jxta;

import net.jxta.discovery.DiscoveryListener;
import network.api.Messages;
import network.api.Peer;
import network.api.SearchListener;
import network.api.ServiceListener;
import network.api.advertisement.Advertisement;
import network.api.service.InvalidServiceException;
import network.api.service.Service;

public class ResilientService implements Service{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void search(String attribute, String value, SearchListener<?> sl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void publishAdvertisement(Advertisement adv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAndStart(Peer peer) throws InvalidServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addListener(ServiceListener l, String who) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListener(String who) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAdvertisementListener(DiscoveryListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAdvertisementListener(DiscoveryListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessages(Messages messages, String... uris) {
		// TODO Auto-generated method stub
		
	}

}
