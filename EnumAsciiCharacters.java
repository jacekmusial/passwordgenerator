package passwordgenerator;

/**
 *
 * @author re
 */
public enum EnumAsciiCharacters {
/* 
    usage, e.g.:
    String useThisCharacters = String.format("%s%s", AsciiCharacters.UPPERCASE, AsciiCharacters.LOWERCASE);
    new PasswordGenerator( useThisCharacters );
  */  
    UPPERCASE( "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ),
    LOWERCASE( "abcdefghijklmnopqrstuvwxyz" ),
    NUMERIC( "1234567890" ),
    SPECIAL( "~!@#$%^&*()_|" );

    private String characters;

    @Override
    public String toString() {
      return this.characters;
    }

    private EnumAsciiCharacters( String characters ) {
      this.characters = characters;
    }
} // EnumAsciiCharacters