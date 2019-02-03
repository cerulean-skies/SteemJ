package eu.bittrade.libs.steemj.apis.follow.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

import eu.bittrade.libs.steemj.base.models.AccountName;
import eu.bittrade.libs.steemj.interfaces.HasJsonAnyGetterSetter;

/**
 * This class represents a Steem "follow_count_api_object" object.
 * 
 * @author <a href="http://steemit.com/@dez1337">dez1337</a>
 */
public class FollowCountApiObject implements HasJsonAnyGetterSetter {
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
    // Original type is uint32_t.
    @JsonProperty("follower_count")
    private int followerCount;
    // Original type is uint32_t.
    @JsonProperty("following_count")
    private int followingCount;

    /**
     * This object is only used to wrap the JSON response in a POJO, so
     * therefore this class should not be instantiated.
     */
    protected FollowCountApiObject() {
    }

    /**
     * @return The account which the {@link #getFollowerCount()
     *         getFollowerCount()} and {@link #getFollowingCount()
     *         getFollowingCount()} results belong to.
     */
    public AccountName getAccount() {
        return account;
    }

    /**
     * @return The number of accounts following the {@link #getAccount()
     *         getAccount()}.
     */
    public int getFollowerCount() {
        return followerCount;
    }

    /**
     * @return The number of accounts the {@link #getAccount() getAccount()}
     *         account is following.
     */
    public int getFollowingCount() {
        return followingCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
