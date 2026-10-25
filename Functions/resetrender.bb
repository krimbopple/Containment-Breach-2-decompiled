Function resetrender%()
    Local local0.items
    Local local1.npcs
    Local local2.rooms
    BXZDBZ0BB\Field1 = 0.0
    BXZDBZ0BB\Field4 = 0.0
    BXZDBZ0BB\Field6 = 0.0
    BXZDBZ0BB\Field0 = 0.0
    For local2 = Each rooms
        hideroomsnocoll(local2)
        hideroomscoll(local2)
    Next
    updatelightvolume()
    updatelights()
    updatedoors()
    updatedecals()
    updaterooms()
    For local0 = Each items
        local0\Field25 = 0.0
        local0\Field35 = 0.0
    Next
    For local1 = Each npcs
        local1\Field2 = 0.0
        local1\Field70 = 0.0
    Next
    XZ0260X8X2\Field16 = 0.0
    shouldentitiesfall = $00
    GUESSEDrenderresetrender(opt\Field76)
    Return $00
End Function
