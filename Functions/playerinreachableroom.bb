Function playerinreachableroom%(arg0%, arg1%, arg2%)
    Local local0%
    If (((((playerroom\Field22\Field21 = $6F) Lor (playerroom\Field22\Field21 = $70)) Lor ((playerroom\Field22\Field21 = $04) And (arg1 = $00))) Lor (isplayeroutsidefacility() And arg2)) <> 0) Then
        Return $00
    EndIf
    If (((forest_event <> Null) And (forest_event\Field19 = playerroom)) <> 0) Then
        If (20.0 < entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
            Return $00
        EndIf
    EndIf
    If (skull_event <> Null) Then
        If (0.0 < skull_event\Field4) Then
            Return $00
        EndIf
    EndIf
    If (arg0 = $00) Then
        If (selecteddifficulty\Field2 = $00) Then
            If (((playerroom\Field22\Field21 = $3C) And (infacility = $FFFFFFFF)) <> 0) Then
                Return $00
            EndIf
        EndIf
    EndIf
    Return $01
    Return $00
End Function
