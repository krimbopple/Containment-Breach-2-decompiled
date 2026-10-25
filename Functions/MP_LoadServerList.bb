Function MP_LoadServerList%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6$
    Local local7%
    Local local8$
    Local local9%
    Local local10.T402X2Z846
    
    local0 = eax_0007
    If (_JsonHasParseError(local0) = $00) Then
        local1 = _JsonGetValue(local0, "servers")
        If (_JsonIsArray(local1) <> 0) Then
            local2 = _JsonGetArray(local1)
            local3 = _JsonGetArraySize(local2)
            For local4 = $00 To (local3 - $01) Step $01
                local5 = _JsonGetArrayValue(local2, local4)
                If (_JsonIsObject(local5) <> 0) Then
                    local6 = GUESSEDgetarg1(local5, "", "ip")
                    local7 = GUESSEDgetbool_2(local5, $00, "category")
                    If (((local6 <> "") And ((local7 = $02) Lor (local7 = $03))) <> 0) Then
                        local8 = trim(_SplitString(local6, ":", $00))
                        local9 = (Int trim(_SplitString(local6, ":", $01)))
                        local10 = GUESSEDcreatedotted(local8, local9, local7)
                        If (local10 <> Null) Then
                            local10\Field8 = $01
                            GUESSEDsetentry(TXFD22D0402\Field3)
                        EndIf
                    EndIf
                EndIf
            Next
        EndIf
    EndIf
    _JsonFreeDocument(local0)
    Return $00
End Function
