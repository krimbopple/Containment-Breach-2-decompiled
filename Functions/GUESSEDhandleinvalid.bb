Function GUESSEDhandleinvalid$(arg0%)
    Select arg0
        Case $FFFFFFFF
            Return "Invalid JSON document handle"
        Case $00
            Return "No error"
        Case $01
            Return "The document is empty"
        Case $02
            Return "The document root must not be followed by other values"
        Case $03
            Return "Invalid value"
        Case $04
            Return "Missing a name for object member"
        Case $05
            Return "Missing a colon after a name of object member"
        Case $06
            Return "Missing a comma or '}' after an object member"
        Case $07
            Return "Missing a comma or ']' after an array element"
        Case $08
            Return "Incorrect hex digit after \u escape in string"
        Case $09
            Return "The surrogate pair in string is invalid"
        Case $0A
            Return "Invalid escape character in string"
        Case $0B
            Return "Missing a closing quotation mark in string"
        Case $0C
            Return "Invalid encoding in string"
        Case $0D
            Return "Number too big to be stored in double"
        Case $0E
            Return "Miss fraction part in number"
        Case $0F
            Return "Miss exponent in number"
        Case $10
            Return "Terminate parsing due to Handler error"
        Case $11
            Return "Unspecific syntax error"
        Default
            Return "Unknown error"
    End Select
    Return ""
End Function
