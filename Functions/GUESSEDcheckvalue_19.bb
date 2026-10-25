Function GUESSEDcheckvalue_19%(arg0.TX2BF6X0FF4, arg1%, arg2%)
    Local local0.EZZ00XD2
    Local local1.X44ZF6442X
    local0 = arg0\Field55
    local1 = GUESSEDcheckvalue_12(arg1)
    If (local1 = Null) Then
        GUESSEDfreeentity_6(arg0)
        If (local0\Field21 <> $00) Then
            local0\Field21 = $00
            GUESSEDsetfield_20(arg0)
        EndIf
        Return $00
    EndIf
    If (arg2 = $00) Then
        Select arg1
            Case $01
                If (((arg0\Field23 >= $00) And GUESSEDgetarray_7(arg0\Field23)) <> 0) Then
                    GUESSEDcheckvalue_38(arg0, arg0\Field23, $00)
                Else
                    GUESSEDcheckvalue_38(arg0, rand($01, $06), $00)
                EndIf
            Case $02
                GUESSEDcheckvalue_38(arg0, $07, $00)
            Case $0B
                GUESSEDcheckvalue_38(arg0, $12, $00)
            Case $0A
                GUESSEDcheckvalue_38(arg0, $13, $00)
            Case $09
                GUESSEDcheckvalue_38(arg0, $14, $00)
            Case $10
                GUESSEDcheckvalue_38(arg0, $1E, $00)
            Default
                GUESSEDcheckvalue_38(arg0, $00, $00)
        End Select
    Else
        GUESSEDcheckvalue_38(arg0, local0\Field4, $00)
    EndIf
    local0\Field18 = local1\Field13
    local0\Field12 = $00
    local0\Field4 = $00
    If (local0\Field21 <> arg1) Then
        local0\Field21 = arg1
        GUESSEDfreeentity_6(arg0)
        GUESSEDsetfield_20(arg0)
    EndIf
    Return $00
End Function
