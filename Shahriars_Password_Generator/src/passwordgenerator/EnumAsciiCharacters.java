package passwordgenerator;

public enum EnumAsciiCharacters {

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