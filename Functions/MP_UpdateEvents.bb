Function MP_UpdateEvents%()
    Local local0%
    Local local1%
    Local local2%
    Local local3.events
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    Local local17%
    Local local18%
    Local local19%
    Local local20%
    Local local21%
    Local local22%
    Local local23%
    Local local24$
    Local local25%
    Local local26%
    Local local27%
    Local local28%
    Local local29%
    Local local30$
    Local local31%
    Local local32%
    Local local33%
    Local local34%
    Local local35%
    Local local36%
    Local local37%
    Local local38%
    Local local39%
    Local local40%
    Local local41%
    Local local42$
    Local local43%
    Local local44%
    Local local45%
    Local local46%
    Local local47%
    Local local48%
    Local local49%
    Local local50#
    Local local51.TX2BF6X0FF4
    catcherrors("MP_UpdateEvents()")
    If (((GUESSEDupdateanimatenpc() = $00) And (((GUESSEDgetglobal() = $00) Lor (GUESSEDgetglobal_16() = $00)) Lor (GUESSEDsetglobal_17() = $00))) <> 0) Then
        Return $00
    EndIf
    T244XB28X4 = playerroom
    local49 = i_268\Field3
    local50 = XZ0260X8X2\Field11
    local51 = Null
    If (GUESSEDupdateanimatenpc() = $00) Then
        local51 = (New TX2BF6X0FF4)
        local51\Field13 = $00
        local51\Field52 = createpivot($00)
        local51\Field50 = createcamera($00)
        cameraprojmode(local51\Field50, $00)
        local51\Field55 = (New EZZ00XD2)
    EndIf
    For local3 = Each events
        If (((local3\Field27 And (local3\Field19 <> Null)) And (local51 <> Null)) <> 0) Then
            positionentity(local51\Field52, local3\Field19\Field40, local3\Field19\Field3, local3\Field19\Field37, $00)
            local51\Field3 = local3\Field19\Field1
        EndIf
        GUESSEDsetfield_5(local3)
        playerroom = T244XB28X4
        XZ0260X8X2\Field74 = GUESSEDgetsetnpcframe()
        local3\Field10 = $01
        If (((local3\Field5 <> Null) And (local3\Field6 = $00)) <> 0) Then
            playerroom = XXDB6F64F2[local3\Field5\Field3]
            XZ0260X8X2\Field74 = local3\Field5\Field52
            local3\Field10 = (local3\Field5 = TXXF6F02DB2[GUESSEDupdatedropitem()])
        EndIf
        i_268\Field3 = (local3\Field10 * local49)
        local3\Field22 = (local3\Field22 - fps\Field3[$00])
        If (0.0 >= local3\Field22) Then
            GUESSEDsetentity_6(local3)
            local3\Field22 = 35.0
        EndIf
        
        If (local3 <> Null) Then
            GUESSEDsetfield_10(local3)
            catcherrors((("Uncaught: MP_UpdateEvents(Event ID: " + (Str local3\Field32)) + ")"))
        EndIf
    Next
    If (local50 < XZ0260X8X2\Field11) Then
        TXDFXDZXXDD\Field15 = (GUESSEDupdateitems_2() + $3E8)
    EndIf
    If (local51 <> Null) Then
        freeentity(local51\Field52)
        freeentity(local51\Field50)
        Delete local51\Field55
        Delete local51
    EndIf
    XZ0260X8X2\Field74 = GUESSEDgetsetnpcframe()
    playerroom = T244XB28X4
    i_268\Field3 = local49
    updateexplosion()
    Return $00
End Function
