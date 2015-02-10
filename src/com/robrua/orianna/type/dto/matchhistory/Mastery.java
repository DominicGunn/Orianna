package com.robrua.orianna.type.dto.matchhistory;

import com.robrua.orianna.type.dto.OriannaDto;

public class Mastery extends OriannaDto {
    private static final long serialVersionUID = -757215029220602845L;
    private Long masteryId, rank;

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(!(obj instanceof Mastery)) {
            return false;
        }
        final Mastery other = (Mastery)obj;
        if(masteryId == null) {
            if(other.masteryId != null) {
                return false;
            }
        }
        else if(!masteryId.equals(other.masteryId)) {
            return false;
        }
        if(rank == null) {
            if(other.rank != null) {
                return false;
            }
        }
        else if(!rank.equals(other.rank)) {
            return false;
        }
        return true;
    }

    /**
     * @return the masteryId
     */
    public Long getMasteryId() {
        return masteryId;
    }

    /**
     * @return the rank
     */
    public Long getRank() {
        return rank;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (masteryId == null ? 0 : masteryId.hashCode());
        result = prime * result + (rank == null ? 0 : rank.hashCode());
        return result;
    }

    /**
     * @param masteryId
     *            the masteryId to set
     */
    public void setMasteryId(final Long masteryId) {
        this.masteryId = masteryId;
    }

    /**
     * @param rank
     *            the rank to set
     */
    public void setRank(final Long rank) {
        this.rank = rank;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Mastery [masteryId=" + masteryId + ", rank=" + rank + "]";
    }
}