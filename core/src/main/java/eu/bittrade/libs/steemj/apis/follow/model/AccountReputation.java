package eu.bittrade.libs.steemj.apis.follow.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import eu.bittrade.libs.steemj.base.models.AccountName;
import eu.bittrade.libs.steemj.interfaces.HasJsonAnyGetterSetter;

/**
 * This class represents a Steem "account_reputation" object.
 * 
 * @author <a href="http://steemit.com/@dez1337">dez1337</a>
 */
public class AccountReputation implements HasJsonAnyGetterSetter {
	private final Map<String, Object> _anyGetterSetterMap = new HashMap<>();
	@Override
	public Map<String, Object> _getter() {
		return _anyGetterSetterMap;
	}

	@Override
	public void _setter(String key, Object value) {
		_getter().put(key, value);
	}

    private AccountName account;
    // Original type is "share_type" which is a "safe<int64_t>".
    private long reputation;

    /**
     * This object is only used to wrap the JSON response in a POJO, so
     * therefore this class should not be instantiated.
     */
    protected AccountReputation() {
    }

    /**
     * Get the name of the account.
     * 
     * @return The name of the account.
     */
    public AccountName getAccount() {
        return account;
    }

    /**
     * Get the reputation of the requested {@link #getAccount()}.
     * 
     * @return The reputation of the requested {@link #getAccount()}.
     */
    public long getReputation() {
        return reputation;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
