package org.msn.test.assignment.players.model;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public abstract class Player {

    public abstract Long getPlayerId();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(getPlayerId(), player.getPlayerId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getPlayerId())
                .toHashCode();
    }
}
