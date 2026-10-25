Function GUESSEDpositionentity_6%(arg0.npcs)
    Local local0#
    If ((arg0\Field50 And (arg0\Field56 > $00)) <> 0) Then
        XD0D068644[arg0\Field56] = Null
        arg0\Field56 = $00
    EndIf
    If (((arg0\Field50 = $00) And (GUESSEDupdateanimatenpc() = $00)) <> 0) Then
        local0 = distancesquared(entityx(arg0\Field82, $00, 1.0), arg0\Field35, entityy(arg0\Field82, $00, 1.0), arg0\Field87, entityz(arg0\Field82, $00, 1.0), arg0\Field3)
        If (0.01 <= local0) Then
            If (0.25 <= local0) Then
                positionentity(arg0\Field82, arg0\Field35, arg0\Field87, arg0\Field3, $01)
            Else
                positionentity(arg0\Field82, curvevalue(arg0\Field35, entityx(arg0\Field82, $00, 1.0), 4.0), arg0\Field87, curvevalue(arg0\Field3, entityz(arg0\Field82, $00, 1.0), 4.0), $01)
            EndIf
            resetentity(arg0\Field82)
        EndIf
    EndIf
    Return $00
End Function
