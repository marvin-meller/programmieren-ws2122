package edu.kit.informatik.tutorium8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PatternCommand extends SimpleCommand {
    public static final Pattern INTEGER = Pattern.compile("[+-]?[0-9]+");

    private final Pattern[] patterns;

    public PatternCommand(Pattern... args) {
        super(args.length);
        this.patterns = args;
    }

    @Override
    protected void validate(String[] args) throws UserInputException {
        super.validate(args);

        for (int i = 0; i < patterns.length; i++) {
            Matcher matcher = patterns[i].matcher(args[i]);
            if (!matcher.matches()) throw new UserInputException("arguments don't match the expected pattern");
        }
    }
}
