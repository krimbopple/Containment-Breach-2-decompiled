Function GUESSEDreadudp%()
    Local local0.XB2D08Z642
    Local local1%
    Local local2%
    Local local3%
    Local local4.T402X2Z846
.section__4033
    While (recvudpmsg(C2DFF2ZD0\Field0) <> 0)
        If (GUESSEDsetglobal_17() = $00) Then
            If (readint(C2DFF2ZD0\Field0) <> $3384C34A) Then
                Goto section__4033
            EndIf
            local1 = udpmsgip(C2DFF2ZD0\Field0)
            local2 = udpmsgport(C2DFF2ZD0\Field0)
            For local0 = Each XB2D08Z642
                If (((local0\Field0 = local1) And (local0\Field1 = local2)) <> 0) Then
                    If ((millisecs() - local0\Field6) < C2DFF2ZD0\Field1) Then
                        resizebank(local0\Field3\Field3, $2000)
                        local0\Field3\Field2 = readbytes(local0\Field3\Field3, C2DFF2ZD0\Field0, $00, banksize(local0\Field3\Field3))
                        GUESSEDsetfield_15(local0\Field3)
                        local3 = GUESSEDsetpeek_3(local0\Field3)
                        MP_ServerInfoMenu(dottedip(local1), local2, local0\Field3, (millisecs() - local0\Field6), local3)
                        local0\Field5 = $00
                        resizebank(local0\Field3\Field3, $00)
                    EndIf
                    Exit
                EndIf
            Next
        EndIf
    Wend
    If (GUESSEDupdatexdb() = $00) Then
        For local0 = Each XB2D08Z642
            If (((local0\Field5 <> $00) And (millisecs() > (local0\Field5 + C2DFF2ZD0\Field1))) <> 0) Then
                MP_ServerInfoMenu(dottedip(local0\Field0), local0\Field1, Null, $00, $00)
                local0\Field5 = $00
            EndIf
            If (((local0\Field2 <> $00) And (millisecs() > local0\Field2)) <> 0) Then
                GUESSEDwritesend(dottedip(local0\Field0), local0\Field1, $00, $00)
                local0\Field2 = $00
            EndIf
        Next
        For local4 = Each T402X2Z846
            If (local4\Field2 <> 0) Then
                If (local4\Field5 < millisecs()) Then
                    GUESSEDwritesend(local4\Field29, local4\Field16, $00, $00)
                    local4\Field5 = (millisecs() + $5DC)
                EndIf
            EndIf
        Next
    EndIf
    Return $00
End Function
