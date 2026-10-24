Function affectdecaydoor%(arg0.doors)
    Local local0%
    If ((arg0\Field5 Lor (countchildren(d_i\Field10[arg0\Field37[$00]]) < $02)) <> 0) Then
        Return $00
    EndIf
    arg0\Field5 = $01
    local0 = $00
    Select arg0\Field46
        Case $00,$07,$01
            local0 = $01
        Case $03,$02
            local0 = $02
    End Select
    If (local0 = $00) Then
        Return $00
    EndIf
    If (arg0\Field37[$00] <> $FFFFFFFF) Then
        entityinstance(arg0\Field0, getchild(d_i\Field10[arg0\Field37[$00]], local0))
    EndIf
    If (((arg0\Field37[$01] <> $FFFFFFFF) And (arg0\Field7 <> $00)) <> 0) Then
        entityinstance(arg0\Field7, getchild(d_i\Field10[arg0\Field37[$01]], local0))
    EndIf
    If (arg0\Field37[$02] <> $FFFFFFFF) Then
        entityinstance(arg0\Field51, getchild(d_i\Field4[arg0\Field37[$02]], local0))
    EndIf
    Return $00
End Function
