Function GUESSEDhideentity_9%(arg0.TX2BF6X0FF4)
    Local local0#
    Local local1#
    Local local2%
    Local local3#
    Local local4#
    Local local5.XZBB2222DZ
    Local local6#
    Local local7#
    If (arg0\Field13 = GUESSEDupdatedropitem()) Then
        Return $00
    EndIf
    local0 = 7.0
    local1 = 12.0
    local3 = 0.0
    local4 = 1.0
    If (arg0\Field55\Field5 <> Null) Then
        local3 = arg0\Field55\Field5\Field38
        If (0.0 < arg0\Field55\Field6) Then
            local4 = arg0\Field55\Field6
        EndIf
    EndIf
    For local2 = $00 To $05 Step $01
        local5 = arg0\Field43[local2]
        If (local5\Field1 <> 0) Then
            GUESSEDpositionentity_2(arg0, local2)
            local5\Field1 = $00
        EndIf
        If (local5\Field6 <> $00) Then
            If (((((local1 >= entitydistancesquared(arg0\Field52, XZ0260X8X2\Field74)) And (arg0\Field12 = $00)) And (T8X2046020\Field13 = $00)) And arg0\Field4) <> 0) Then
                If (entityhidden(local5\Field6) <> 0) Then
                    showentity(local5\Field6)
                EndIf
                local6 = entitydistancesquared(local5\Field6, camera)
                local7 = min((clamp((1.0 - ((local6 - local0) / max((local1 - local0), 0.0001))), 0.0, 1.0) * (1.0 - ((Float arg0\Field37) * 0.7))), 0.98)
                If (local1 <= local6) Then
                    local7 = 0.0
                EndIf
                positionentity(local5\Field6, 0.0, (((local5\Field8 - ((Float arg0\Field37) * 0.2)) + local3) * local4), 0.0, $00)
                entityalpha(local5\Field6, local7)
            ElseIf (entityhidden(local5\Field6) = $00) Then
                hideentity(local5\Field6)
            EndIf
        EndIf
    Next
    Return $00
End Function
