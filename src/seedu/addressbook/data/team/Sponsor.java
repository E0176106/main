package seedu.addressbook.data.team;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Team's balance of sponsorship in USD in the address book.
 */

public class Sponsor {

    public static final String EXAMPLE = "500";
    public static final String MESSAGE_SPONSOR_CONSTRAINTS = "Team's Sponsorship in USD";
    public static final String SPONSOR_VALIDATION_REGEX = "\\d+";

    public final String value;

    /**
     * Validates given sponsorship amount.
     */
    public Sponsor(String sponsor) throws IllegalValueException {
        sponsor = sponsor.trim();
        if (!isValidSponsor(sponsor)) {
            throw new IllegalValueException(MESSAGE_SPONSOR_CONSTRAINTS);
        }
        this.value = sponsor;
    }

    /**
     * Checks if a given string is a valid sponsorship amount.
     */
    public static boolean isValidSponsor(String test) {
        return test.matches(SPONSOR_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Sponsor // instanceof handles nulls
                && this.value.equals(((Sponsor) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
