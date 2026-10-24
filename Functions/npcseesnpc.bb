Function npcseesnpc%(arg0.npcs, arg1.npcs, arg2#)
    Local local0#
    If (((arg0 = Null) Lor (arg1 = Null)) <> 0) Then
        Return $00
    EndIf
    If (arg2 > entitydistancesquared(arg0\Field82, arg1\Field82)) Then
        If (entityvisible(arg0\Field82, arg1\Field82, 0.0) <> 0) Then
            Return $01
        EndIf
        If (arg0 = n_i\Field3) Then
            local0 = clamp((distance(entityx(n_i\Field3\Field82, $00, 1.0), n_i\Field3\Field49, entityz(n_i\Field3\Field82, $00, 1.0), n_i\Field3\Field15, 0.0, 0.0) * 2.5), 0.0, 1.0)
            If (0.0 < local0) Then
                Return $02
            EndIf
        EndIf
    EndIf
    Return $00
    Return $00
End Function
