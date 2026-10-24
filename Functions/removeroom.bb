Function removeroom%(arg0.rooms)
    Local local0%
    For local0 = $00 To $02 Step $01
        If (arg0\Field26[local0] <> $00) Then
            deletesingletextureentryfromcache(arg0\Field26[local0], $00)
            arg0\Field26[local0] = $00
        EndIf
    Next
    For local0 = $00 To $1D Step $01
        If (arg0\Field27[local0] <> $00) Then
            entityparent(arg0\Field27[local0], $00, $01)
        EndIf
    Next
    For local0 = $00 To $1D Step $01
        If (arg0\Field27[local0] <> $00) Then
            freeentity(arg0\Field27[local0])
            arg0\Field27[local0] = $00
        EndIf
    Next
    If (arg0\Field35 <> $00) Then
        freeentity(arg0\Field35)
        arg0\Field35 = $00
    EndIf
    freeentity(arg0\Field15)
    arg0\Field15 = $00
    TXFD2DZZD2(arg0)
    Delete arg0
    Return $00
End Function
