Function GUESSEDisentity_7%(arg0.rooms, arg1%, arg2#, arg3%, arg4%)
    Local local0%
    Local local2%
    If ((((((((menuopen Lor invopen) Lor consoleopen) Lor i_294\Field4) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor (Int XZ0260X8X2\Field48)) <> 0) Then
        Return $00
    EndIf
    Select arg4
        Case $00
            local0 = arg0\Field27[arg1]
        Case $01
            local0 = arg0\Field32[arg1]\Field98
        Case $03
            GUESSEDgetmap($02, arg1)
            local2 = eax_0028
            If (local2 <> $00) Then
                
                local0 = eax_002F
            EndIf
    End Select
    If ((((grabbedentity <> $00) And (grabbedentity <> local0)) Lor (local0 = $00)) <> 0) Then
        Return $00
    EndIf
    If ((arg2 * arg2) > entitydistancesquared(XZ0260X8X2\Field74, local0)) Then
        If (entitypick(camera, arg2) = local0) Then
            handentity = local0
            Select arg3
                Case $00
                    If (XZ0260X8X2\Field3 <> 0) Then
                        If (GUESSEDupdateanimatenpc() <> 0) Then
                            GUESSEDcreateentity_4(TXXF6F02DB2[GUESSEDupdatedropitem()], arg1, arg4)
                            Return $01
                        EndIf
                        GUESSEDsendnpcaction(arg1, arg4)
                        Return $01
                    EndIf
                Case $01
                    If (XZ0260X8X2\Field29 <> 0) Then
                        Return $01
                    EndIf
                Case $02
                    If (XZ0260X8X2\Field54 <> 0) Then
                        If (GUESSEDupdateanimatenpc() <> 0) Then
                            GUESSEDcreateentity_4(TXXF6F02DB2[GUESSEDupdatedropitem()], arg1, arg4)
                            Return $01
                        EndIf
                        GUESSEDsendnpcaction(arg1, arg4)
                        Return $01
                    EndIf
            End Select
        EndIf
    EndIf
    Return $00
    Return $00
End Function
