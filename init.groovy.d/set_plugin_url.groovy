import hudson.model.UpdateCenter;
import hudson.model.UpdateSite;
import hudson.util.PersistedList;
import jenkins.model.Jenkins

site = 'http://updates.jenkins.io/update-center.json'
PersistedList<UpdateSite> sites = Jenkins.getInstance().getUpdateCenter().getSites();
for (UpdateSite s : sites) {
  if (s.getId().equals(UpdateCenter.ID_DEFAULT))
    sites.remove(s);
}
sites.add(new UpdateSite(UpdateCenter.ID_DEFAULT, site));